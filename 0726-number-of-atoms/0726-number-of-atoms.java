class Solution {
    public String countOfAtoms(String formula) {
        
        // Multiplying numbers if there are parenthesis
        LinkedList<Integer> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder(formula);
        for(int i = 0; i < sb.length()-1; i++){
            if(sb.charAt(i) == '('){
                stack.push(i);
            }
            if(sb.charAt(i) == ')'){
                if(Character.isDigit(sb.charAt(i+1))){
                    
                    int endNum = i+1;
                    while(endNum < sb.length() && Character.isDigit(sb.charAt(endNum))){
                        endNum++;
                    }                
                    String product = multiply(sb.substring(stack.peek()+1, i), Integer.parseInt(sb.substring(i+1, endNum)));
                    sb.replace(stack.pop(), endNum, product);
                    i--;
                }
            }
        }
        
        
        // Adding numbers of the same element together
        StringBuilder finalSb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < sb.length(); i++){
            if(Character.isUpperCase(sb.charAt(i))){
                
                int endElement = i+1;
                while(endElement < sb.length() && Character.isLowerCase(sb.charAt(endElement))){
                    endElement++;
                }
                String element = sb.substring(i, endElement);

                int endNum = endElement;
                while(endNum < sb.length() && Character.isDigit(sb.charAt(endNum))){
                    endNum++;
                }
                int num = 1;
                if (endNum > endElement) {
                    num = Integer.parseInt(sb.substring(endElement, endNum));
                }
                
                map.put(element, map.getOrDefault(element, 0) + num);
                i = endNum - 1;
                
            }
        }
        
        // Sorting alphabetically and building the final string
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            finalSb.append(entry.getKey());
            if(entry.getValue() > 1){
                finalSb.append(entry.getValue());
            }
        }
        return finalSb.toString();
    }

    // Helper method for parenthesis multiplication
    public static String multiply(String s, int m){
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                sb.append(s.charAt(i));
                if(i < s.length()-1 && Character.isLowerCase(s.charAt(i+1))){
                    sb.append(s.charAt(i+1));
                    i++;
                }
                if(i == s.length()-1 || Character.isLetter(s.charAt(i+1))){
                    sb.append(m);                       
                }
                else{
                    int endNum = i+1;
                    while(endNum < s.length() && Character.isDigit(s.charAt(endNum))){
                        endNum++;
                    }  
                    sb.append(Integer.parseInt(s.substring(i+1,endNum)) * m);
                }
            }
        }
        return sb.toString();
    }
}