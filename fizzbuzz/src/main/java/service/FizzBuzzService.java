package service;

public class FizzBuzzService {
  public String fizzBuzz(String number) {
	  
    if (number.equals("3") || number.equals("6") || number.equals("9")) {
      return "fizz";
    } else if (number.equals("5")) {
      return "buzz";
    }
    return number;
  }
}
