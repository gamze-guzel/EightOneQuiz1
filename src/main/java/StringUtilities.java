import java.util.Scanner;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue      value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
          return baseValue.concat(valueToBeAdded);
//        return baseValue += valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        return new StringBuilder(valueToBeReversed).reverse().toString();

//        String reverse = "";
//        for (int i = toString().length() - 1; i >= 0; i--) {
//            reverse += valueToBeReversed.charAt(i);
//
//        }
//        return reverse;
    }




    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length() / 2);
    }

//        Scanner input = new Scanner(System.in);
//
//        int len = word.length();
//        int c = len / 2;
//
//        return word.charAt(c);




    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String s="" +charToRemove;
        String replace= "";
        String strNew= value.replace(s, replace);
        return strNew;



    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
