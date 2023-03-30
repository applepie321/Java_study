// Convert a Number to a String! (8kyu)
// https://www.codewars.com/kata/5265326f5fda8eb1160004c8/java



// My code
class Kata {
    public static String numberToString(int num) {
      return num >= 0 ? String.valueOf(num) : Integer.toString(num);
    }
  }



// User's code

// class Kata {
//  public static String numberToString(int num) {
//    return String.valueOf(num);
//  }
//}


// class Kata {
//     public static String numberToString(int num) {
//       return ""+num;
//     }
//   }