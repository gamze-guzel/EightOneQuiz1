public class MathUtilities {

    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd number
     * @return
     */
    public int add(Integer baseValue, Integer valueToAdd) {

        int first = 7;
        System.out.println(first); // prints 7
        int second = 8;
        System.out.println(second); // prints 8

        int sum = first + second; // The sum of the values of the variables first and second is assigned to the variable sum
        System.out.println(sum); // print

        return sum;
    }


    /**
     * Add two number together
     *
     * @param baseValue  first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd) {
       double input = 10.0;
        System.out.println(input);
       double input2 = 1.22;
        System.out.println(input2);

        double sum = input+ input2; // The sum of the values of the variables first and second is assigned to the variable sum
        System.out.println(sum); // print

       return sum;
    }


    /**
     * Get half the value of the number
     *
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {

        return null;
    }

    /**
     * Determine if the number is odd
     *
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number) {
        return null;
    }


    /**
     * Multiply the number by itself
     *
     * @param number the number given
     * @return the result of the number multiply by itself
     */
    public Integer square(Integer number) {

        return number;
    }
}