package class14;

import java.util.Locale;

public class Task1 {
   //cod String input and check if its palindrome or not
    boolean isPalindrome(String str){
        String reverseStr="";
        for (int i = str.length()-1; i <=0 ; i--) {
            reverseStr=reverseStr+str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reverseStr)){
            isStrPalindrome=true;
        }
           return isStrPalindrome;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        boolean result=task1.isPalindrome("car");
        System.out.println(result);
    }
}

//new StringBuilder(str) - converts the String to a StringBuilder
//reverse() - reverses the contents   in StringBuilder
//to String() - it converts the StringBuilder back to a String
//
/*isThePalindrome(String st) {
        String s = st.toLowerCase();
        int l = 0, r = s.length() - 1;
        boolean isPalindrome = true;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        return isPalindrome;
    }*/