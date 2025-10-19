package service;

public class FizzBuzzService {
  public String fizzBuzz(String number) {
    if (Integer.parseInt(number) % 3 == 0) {
      return "fizz";
    } else if (Integer.parseInt(number) % 5 == 0) {
      return "buzz";
    }
    return number;
  }
}
