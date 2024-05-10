/*
 * This Square class contains a method which tests if a certain integer input
 * is a perfect square
 *
 * @author Ipinoluwa Hezekiah Shobayo
 *
 * */


public class Square {    
    public static boolean isSquare(int n) {
      if (n < 0) {
        return false;
      }
      if (n == 0) {
        return true;
      }
      double num = (double)n;
      num = Math.pow(num, 0.5);
      if (num % (int)num != 0) {
        return false;
      }
      return true;
    }
}
