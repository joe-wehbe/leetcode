class Solution {
    public String fractionAddition(String expression) {
        StringBuilder operand1 = new StringBuilder();
        StringBuilder operand2 = new StringBuilder();
        String result = "";
        int count = 0;
        
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == '/')
                count++;
        }
        
        if(count == 1){
            return expression;
        }
        
        count = 0;
        
        for(int i = 0; i < expression.length(); i++){
            if(count == 0)
                if(expression.charAt(i) != '+')
                    operand1.append(expression.charAt(i));
            
            if(count == 1)
                if(expression.charAt(i) != '+')
                    operand2.append(expression.charAt(i));
                
            if(expression.charAt(i) == '/') {
                if(count == 0) {
                    operand1.append(expression.charAt(i+1));
                    if(i < expression.length() - 2 && expression.charAt(i+2) == '0'){
                        operand1.append(expression.charAt(i+2));
                        i++;
                    }
                }
                
                if(count == 1) {
                    operand2.append(expression.charAt(i+1));
                    if(i < expression.length() - 2 && expression.charAt(i+2) == '0'){
                        operand2.append(expression.charAt(i+2));
                        i++;
                    }
                }
                i++;
                count++;
            }
            
            if(count == 2) {
                result = calculate(operand1.toString(), operand2.toString());
                operand1.setLength(0);
                operand2.setLength(0);
                operand1.append(result);
                count = 1;
            }
        }
        return result;
    }
    
    private String calculate(String operand1, String operand2) {
        int numerator1 = 0;
        int denominator1 = 0;
        int numerator2 = 0;
        int denominator2 = 0;
        int operatorIndex1 = 0;
        int operatorIndex2 = 0;
        
        for(int i = 0; i < operand1.length(); i++){
            if(operand1.charAt(i) == '/'){
                operatorIndex1 = i;
            }
        }
        
        for(int i = 0; i < operand2.length(); i++){
            if(operand2.charAt(i) == '/'){
                operatorIndex2 = i;
            }
        }
        
        if(operand1.charAt(0) == '-'){
            numerator1 = Integer.parseInt(operand1.substring(1,operatorIndex1));
            numerator1 = -numerator1;
            denominator1 = Integer.parseInt(operand1.substring(operatorIndex1+1,operand1.length()));
        }
        else{
            numerator1 = Integer.parseInt(operand1.substring(0,operatorIndex1));
            denominator1 = Integer.parseInt(operand1.substring(operatorIndex1+1,operand1.length()));
        }
        
        if(operand2.charAt(0) == '-'){
            numerator2 = Integer.parseInt(operand2.substring(1,operatorIndex2));
            numerator2 = -numerator2;
            denominator2 = Integer.parseInt(operand2.substring(operatorIndex2+1,operand2.length()));
        }
        else{
            numerator2 = Integer.parseInt(operand2.substring(0,operatorIndex2));
            denominator2 = Integer.parseInt(operand2.substring(operatorIndex2+1,operand2.length()));
        }
        
        if(denominator1 == denominator2){
            return simplify(numerator1 + numerator2, denominator1);
        }
        else{
            numerator1 *= denominator2;
            numerator2 *= denominator1;
            return simplify(numerator1 + numerator2, denominator1 * denominator2);
        }
    }
    
    private String simplify(int numerator, int denominator) {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return numerator + "/" + denominator;
    }

    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}