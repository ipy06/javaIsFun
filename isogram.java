/*
 *
 * An isogram is a word that has no repeating letters, consecutive or 
 * non-consecutive. Implement a function that determines whether a string 
 * that contains only letters is an isogram. Assume the empty string is an 
 * isogram. Ignore letter case.
 *
 * Example: (Input --> Output) 
 * "Dermatoglyphics" --> true 
 * "aba" --> false 
 * "moOse" --> false (ignore letter case)
 * 
 * isIsogram "Dermatoglyphics" = true
 * isIsogram "moose" = false
 * isIsogram "aba" = false
 *
 */


// My solution

public class isogram {
    public static boolean  isIsogram(String str) {
        // ...
      int count;
      String str1 = str.toLowerCase();
      char[] str2 = str1.toCharArray();
      for (char c : str2) {
        count = 0;
        for (char j : str2) {
          if (c == j) {
            count++;
          }
        }
        if (count > 1) {
          return false;
        }
      }
      return true;
    }
}

//A better solution


public class isogram {
  public static boolean  isIsogram(String str) {
	  if (str == null) {
	  	return false;
	  }
	  if (str.isEmpty()) {
	  	return true;
	  }
    return str.length() == str.toLowerCase().chars().distinct().count();
  }
}
