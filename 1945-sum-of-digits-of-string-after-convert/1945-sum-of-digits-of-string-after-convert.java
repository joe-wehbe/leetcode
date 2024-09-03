class Solution {
    public int getLucky(String s, int k) {
        return transform(convert(s), k);
    }
    
    public String convert(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
            sb.append((int) s.charAt(i) - 96); 
        return sb.toString();
    }
    
    public int transform(String s, int k){
        int sum = 0;
        while(k > 0){
            sum = 0;
            for(int i = 0; i < s.length(); i++)
                sum += Integer.parseInt(Character.toString(s.charAt(i)));
            s = Integer.toString(sum);
            k--;
        }
        return sum;
    }
}