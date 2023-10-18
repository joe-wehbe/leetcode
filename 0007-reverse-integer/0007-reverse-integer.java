class Solution {
    
    public int reverse(int x) {
        
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();
        
        int i = 0;
        int j = chars.length - 1;
        char temp;

        if(chars[i] == '-'){
            i++;
        }
        
        while (j >= i){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        
        str = new String(chars);

        try{
            x = Integer.parseInt(str);
            return x;
        }catch(NumberFormatException e){
            return 0;
        }
    }
}