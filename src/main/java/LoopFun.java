 

public class LoopFun {

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        int i, fact = 3;
        int factorial = 6;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
        return number;
    }
//            int n= 1;
//              if (n == 1)
//                  return 1;
//              else {
//                  return n * factorial(n - 1);
//              }
//          }


    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
//        String output = "";
//        output += phrase.charAt(0);
//        for (int i = 1; i < phrase.length(); i++) {
//            if (Character.isWhitespace(phrase.charAt(i))) {
//                output = output + phrase.charAt(i);
//                output += phrase.charAt(i + 1);
//            }
//            return output.replaceAll("\\s+", "").toUpperCase();
//        }
//
//        public String acronym(String[] phrase){
//            System.out.print(acronym("Ruby on Rails"));
//        }
//    }
            String acronym = "Ruby on Rails";
            System.out.println(acronym);

            String text = " ";
            for (char c : acronym.toCharArray())
                if (Character.isUpperCase(c))
                    acronym += c;
            System.out.println(acronym);
            return acronym;
        }


      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          return null;
      }
}
