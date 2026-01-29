package org.APCSLowell;

public class Palindrome {
    public boolean palindrome(String s) {
        if (noSpaces(noCapitals(onlyLetters(reverse(s)))).equals(noSpaces(noCapitals(onlyLetters(s))))){
            return true;
        } else {
            return false;
        }
    }
    public String reverse(String s) {
        String string = "";
        for (int i = s.length()-1; i>=0; i--){
            string = string + s.substring(i, i+1);
        }
        return string;
    }
    public String noSpaces(String sWord){
        String string = "";
        for (int i = 0; i<sWord.length(); i++){
            if (!sWord.substring(i, i+1).equals(" ")){
                string += sWord.substring(i, i+1);
            }
        }
        return string;
    }
    public String noCapitals(String sWord){
        return sWord.toLowerCase();
    }
    public String onlyLetters(String sString){
        String string = "";
        for (int i = 0; i < sString.length(); i++){
            if (Character.isLetter(sString.charAt(i))){
            string += sString.substring(i, i+1);
            }
        }
        return string;
    }
}
