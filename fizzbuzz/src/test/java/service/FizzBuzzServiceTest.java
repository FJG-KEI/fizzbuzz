package service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzBuzzServiceTest {

  @Test
  @Description("1を渡したら1が返ってくること")
  public void test01() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("1");

    assertThat(actual).isEqualTo("1");
  }
  
  @Test
  @Description("2を渡したら2が返ってくること")
  public void test02() {
	  FizzBuzzService target = new FizzBuzzService();
	    String actual = target.fizzBuzz("2");

	    assertThat(actual).isEqualTo("2");
  }
}
