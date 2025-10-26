package service;

public class FizzBuzzService {
  public String fizzBuzz(String number) {
	  boolean isMultiplesOfThree = Integer.parseInt(number) % 3 == 0;
	  boolean isMultiplesOfFive = Integer.parseInt(number) % 5 == 0;
	  boolean isMultiplesOfFifteen = Integer.parseInt(number) % 15 == 0;
	  
    if (isMultiplesOfFifteen) {
      return "fizzbuzz";
    }
    
    if (isMultiplesOfThree) {
      return "fizz";
    }
    
    if (isMultiplesOfFive) {
      return "buzz";
    }
    
    return number;
  }
}
