package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer results = 0;
        String[] split_string = input.split(" ");
        for (int i = 0; i < split_string.length; i++) {
            if (split_string[i].charAt(split_string[i].length() - 1) == 'y' || split_string[i].charAt(split_string[i].length() - 1) == 'z') {
                results++;
            }
        }


        return results;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    //        // convert both strings to a split array " "
//       // char[] baseCharacters = base.toCharArray();
//        //  char[]removeCharacters = remove.toCharArray();
//
//        for(int i =0; i<removeCharacters.length; i++){
//            results =results;
//            //loop through remove, and inner loop for base and check if base letter != remove letter and add to results
//        for(int j=0; j<baseCharacters.length; j++){
//            String convertedStringLetter = String.valueOf(baseCharacters[j]);
//
//                if(removeCharacters[i] != baseCharacters[j]){
//                    results+= baseCharacters[j];
//                }else{
//                    continue;
//                }
//
//
//        }
//        if(i < removeCharacters.length-1){
//            results+= " ";
//        }
//
//        }
    public String removeString(String base, String remove) {
        String results = "";
        char[] base_split = base.toCharArray();
        char[] remove_split = remove.toCharArray();
        for (int i = 0; i < base_split.length; i++) {
            results = results;
           String character =  String.valueOf(base_split[i]);
           if(!remove.contains(character)){
              results += base_split[i];
           }

//            for (int j = 0; j < remove.length(); j++) {
//
//                if (base_split[i] == remove_split[j]) {
//                    break;
//                } else{
//                    results += base_split[i];
//                    break;
//                }
//            }
        }
        return results;

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        // set two number variables for is and not
        int is = 0;
        int not = 0;
        char[] input_split = input.toCharArray();
        for (int i = 0; i < input_split.length; i++) {
            if ((input_split[i] == 'i') && (i + 1 < input_split.length) && input_split[i + 1] == 's') {
                is++;
            } else if (input_split[i] == 'n' && (i + 2 < input_split.length) && input_split[i + 1] == 'o' && input_split[i + 2] == 't') {
                not++;
            }
        }
        return not == is;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char[] input_split = input.toCharArray();
        for (int i = 0; i < input_split.length; i++) {
            if ((i + i < input_split.length) && (input_split[i] == 'g') && (input_split[i + 1] == 'g')) {
                return true;
            }
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        char[] input_split = input.toCharArray();
        int results = 0;
        for (int i = 0; i < input_split.length; i++) {
            if ((i + 2 < input_split.length) && (input_split[i + 1] == input_split[i]) && (input_split[i + 2] == input_split[i])) {
                results++;
            }
        }
        return results;
    }
}
