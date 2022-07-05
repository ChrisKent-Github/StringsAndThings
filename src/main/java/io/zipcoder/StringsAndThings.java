package io.zipcoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tariq
 */


public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */


    public static Integer countYZ(String input) {
        int arrIndex = 0;
        int numOfXy = 0;
        ArrayList<Character> arr2Char = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            arr2Char.add(c);
        }
        arr2Char.add(' ');
        for (int p: arr2Char) {
            if (arr2Char.get(arrIndex) == ' ') {
                if (arr2Char.get(arrIndex - 1) == 'y' || arr2Char.get(arrIndex -1) == 'z') {
                    numOfXy++;
                }
            }
            arrIndex++;
        }
//        System.out.println(numOfXy);
    return numOfXy;}

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
//        ArrayList<String> strPieces = new ArrayList<String>();
//        int remIndex = -1;
//        String result = "";
//        if(base.contains(remove)) {
//            for (int i = 0; i < base.length(); i++) {
//                if (i < 1) {
//                    remIndex = base.indexOf(remove, i);
//                    strPieces.add(base.substring(0, i));
//                    i += (remIndex + remove.length());
//                }
//                else {
//                    remIndex = base.indexOf(remove, i);
//                    strPieces.add(base.substring(i,remIndex));
//                    i += (remIndex + remove.length());
//                }
//            }
//            result = String.join("", strPieces);
//         }
//        else {
//            result = base;
//        }
        String result = base;
        while (result.contains(remove)){
            result = result.replaceFirst(remove, "");
        }
        System.out.println(result);
        return result;
        }




    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        boolean result = false;
        char[] toLet = input.toCharArray();
        int isCount = 0;
        int notCount = 0;
        for(int i = 0; i < input.length() - 1; i++){
                if (toLet[i] <= toLet[toLet.length - 1] && toLet[i] == 'i' && toLet[i + 1] == 's') {
                    isCount++;
                    i++;
                }
                if(toLet[i] <= toLet[toLet.length - 2] && toLet[i] == 'n' && toLet[i + 1] == 'o' && toLet[i + 2] == 't'){
                    notCount++;
                    i += 2;
                }

        }
        if(isCount == notCount){
            result = true;
        }
        System.out.println("is:"+isCount);
        System.out.println("not:"+notCount);
        return result;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return false
     */
    public Boolean gIsHappy(String input){
        boolean result = false;
        char[] toLetters = input.toCharArray();
        for(int i = 0; i < input.length() - 1; i++){
            if(toLetters[i] == 'g'){
                if(toLetters[i] == toLetters[i + 1]){
                    result = true;
                    i++;
                }
                else{
                    result = false;
                    break;
                }
            }
        }
        return result;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int tripleChk = 0;
        int doubleCount = 0;
        char[] toLetters = input.toLowerCase().toCharArray();
        for(int i = 0; i < input.length() - 2; i++){
        if(toLetters[i] == toLetters[i + 1] && doubleCount < 1){
            doubleCount++;
            }
        else if(toLetters[i] == toLetters[i + 1] && doubleCount > 0){
            tripleChk++;
            if(toLetters[i] != toLetters[i + 2])
            doubleCount = 0;
            }
        }
        return tripleChk;
    }

    public static void main(String[] args){
        String removeString;
    }
}




