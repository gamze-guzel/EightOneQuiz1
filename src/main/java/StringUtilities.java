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
        String part1 = "Star";
        String part2 = "Tetrahedron";
        String full = part1 + part2;

        System.out.println(full);
        return full;
    }


    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {

        String reverse = "";
        for (int i = toString().length() - 1; i >= 0; i--) {
            return=reverse + to.string.charAt(i);
            System.out.println(reverse);
        }
        return result;
    }


    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = input.nextLine();
        int len = str.length();
        int c = len / 2;
        char ch[] = str.toCharArray();
        System.out.println("Middle Character is: " + ch[c]);
        return getMiddleCharacter();
    }






    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        return null;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return null;
    }
}
