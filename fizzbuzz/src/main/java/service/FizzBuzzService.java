package service;

public class FizzBuzzService {
  public String fizzBuzz(String number) {
	  boolean isMultiplesOfThree = Integer.parseInt(number) % 3 == 0;
	  boolean isMultiplesOfFive = Integer.parseInt(number) % 5 == 0;
	  String result = "";
    	
    if (isMultiplesOfThree) {
      result += "fizz";
    }
    
    if (isMultiplesOfFive) {
      result += "buzz";
    }
    
    return result != "" ? result : number;
    
  }
}
