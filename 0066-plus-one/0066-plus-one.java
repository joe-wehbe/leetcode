import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean addZero = false;
        
        if(digits[index] < 9){
            digits[index]++;
        }
        else if (index == 0){
            if(digits[index] < 9){
                digits[index]++;
            }
            else{
                digits[index] = 1;
                addZero = true;
            }
        }
        else{
            int flag = 0;
            while(digits[index] == 9 && flag == 0){
                
                index--;
                if(digits[index] < 9){
                    digits[index]++;
                    flag = 1;
                    index++;
                }
                if(digits[index] == 9 && index == 0){
                    digits[index] = 1;
                    flag = 1;
                    index++;
                    addZero = true;
                }
            }
            while(index < digits.length){
                digits[index] = 0;
                index++;
            }
        }
        if(addZero){
            int[] newArray = new int[digits.length + 1];
                
            for(int i = 0; i < digits.length; i++){
                newArray[i] = digits[i];
                    
                if(i == digits.length - 1){
                    newArray[i+1] = 0;
                }
            }
            digits = newArray;
        }
        return digits;
    }
}