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
//        return new StringBuilder(valueToBeReversed).reverse().toString();
        StringBuilder reverse = new StringBuilder();
        for (int i = valueToBeReversed.length() -1; i >= 0; i--) {
            reverse.append(valueToBeReversed.charAt(i));
        }
        String result = reverse.toString();
        return result;

    }


    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {

        return word.charAt(word.length() / 2);
    }

//  int strLength =word.length();
//  int middleChar= strLength /2;
//  return word.charAt(middleChar);



    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove){
            return value.replace(charToRemove.toString(), "");
        }


    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String [] sentenceArray= sentence.split(" ");
        return sentenceArray[sentenceArray.length-1];
    }
}
