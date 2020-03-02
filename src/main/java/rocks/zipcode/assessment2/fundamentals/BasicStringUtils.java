package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder input = new StringBuilder();
        input.append(string1);
        input = input.reverse();
        return input.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String rev1 = reverse(string1);
        String rev2 = reverse(string2);

        return rev1+rev2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {

        ArrayList<Character> removeChars = new ArrayList<>();
        for(Character c : charactersToRemove.toCharArray()){
            removeChars.add(c);
        }


       StringBuffer sb = new StringBuffer(string);
        for(int i = 0; i < sb.length(); i++) {
            if(removeChars.contains(sb.charAt(i))) {
                sb.replace(i, i+1,"");
                i--;
            }
        }

        return sb.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removed =  removeCharacters(string, charactersToRemove);
        String revStr = reverse(removed);
        return revStr;
    }
}
