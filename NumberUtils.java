/*
 * This code determines if a number is Narcissistic 
 * i.e 153 -> 1^3 + 5^3 + 3^3 = 153 hence 153 is narcissistic
 *
 * @author: Ipinoluwa Hezekiah Shobayo
 *
 */


public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int sum = 0;
        int og_num = number;
        int numOfDigits = Integer.toString(number).length();

        while (number > 0) {
            sum += Math.pow((number % 10), numOfDigits);
            number /= 10;
        }

        return sum == og_num;
    }

}

