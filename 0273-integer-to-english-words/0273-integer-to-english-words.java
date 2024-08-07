class Solution {

    public static String numberToWords(int num) {
        
        if(num == 0){
            return "Zero";
        }
        
        String str = addCommas(num);
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        String[] names = {""," Thousand ", " Million ", " Billion "};
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ','){
                sb.append(str.charAt(i));
            }
            if(str.charAt(i) == ',' || i == str.length() - 1){
                String word = toWord(sb.toString());
                result.append(word);
                
                if(word.length() > 0){
                    result.append(names[commasNumber]);
                }
                
                if(commasNumber > 0){
                    commasNumber--;
                }
                sb.setLength(0);
            }
        }
        
        return result.toString().trim();
    }
    
    private static int commasNumber = 0;
    private static String addCommas(int num){
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        
        if(num < 1000){
            return str;
        }
        
        int count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            sb.insert(0, str.charAt(i));
            count++;
            
            if(count == 3 && i > 0){
                sb.insert(0, ",");
                count = 0;        
                commasNumber++;
            }
        }
        return sb.toString();
    }
    
    private static String toWord(String str){
        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        
        while(Integer.parseInt(Character.toString(str.charAt(0))) == 0){
            str = str.substring(1);
            
            if(str.length() == 0){
                return "";
            }
        }
        
        int num = Integer.parseInt(str);

        if(str.length() == 2) {
            if(num > 9 && num < 20){
                return teens[num - 10];
            }
            else{
                int firstDigit = Integer.parseInt(Character.toString(str.charAt(0)));
                int secondDigit = Integer.parseInt(Character.toString(str.charAt(1)));
                
                if(secondDigit != 0) {
                    return tens[firstDigit - 2] + " " + units[secondDigit];   
                }
                else{
                    return tens[firstDigit - 2];
                }
            }
        }
        
        if(str.length() == 3){
            StringBuilder sb = new StringBuilder();

            int firstDigit = Integer.parseInt(Character.toString(str.charAt(0)));
            int secondDigit = Integer.parseInt(Character.toString(str.charAt(1)));
            int thirdDigit = Integer.parseInt(Character.toString(str.charAt(2)));
            
            if(firstDigit != 0){
                sb.append(units[firstDigit] + " Hundred ");
            
                if(secondDigit == 0 && thirdDigit == 0) {
                    return sb.toString().trim();
                }
                else if(secondDigit == 0 && thirdDigit != 0) {
                    sb.append(units[thirdDigit]);
                }
                else{
                    int tenth = Integer.parseInt(str.substring(1));
                    
                    if(tenth > 9 && tenth < 20){
                        sb.append(teens[tenth - 10]);
                    }
                    else{
                        sb.append(tens[secondDigit-2]);
                        if(secondDigit != 0 && thirdDigit != 0) {
                            sb.append(" " + units[thirdDigit]);
                        }
                    }
                }            
            }
            return sb.toString();
        }
        return units[num];
    }
}