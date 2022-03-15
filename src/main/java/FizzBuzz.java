public class FizzBuzz {
  public String fizzBuzz(int num) {
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
      //changing int to string
      fizzBuzzVal.append(num);
    }
   return fizzBuzzVal.toString();
  }

}


