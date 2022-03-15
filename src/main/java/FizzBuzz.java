public class FizzBuzz {
//    public static void main(String[] args) {
//        String inputStr = args[0];
//        fizzBuzz(Integer.parseInt(inputStr));
//
//    }

  public static String fizzBuzz(int num) {
    StringBuilder fizzBuzzVal = new StringBuilder();
    if (num % 15== 0) {
      fizzBuzzVal.append("FizzBuzz");
    }
   else if (num % 3 == 0) {
      fizzBuzzVal.append("Fizz");
    }
   else if (num % 5 == 0) {
      fizzBuzzVal.append("Buzz");
    } else {
      fizzBuzzVal.append(num);
    }
//      System.out.println(fizzBuzzVal);
   return fizzBuzzVal.toString();
  }

}


