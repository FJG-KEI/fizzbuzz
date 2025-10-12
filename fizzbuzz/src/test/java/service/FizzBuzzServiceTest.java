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

  @Test
  @Description("3を渡したらfizzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("3");

    assertThat(actual).isEqualTo("fizz");
  }
  
  @Test
  @Description("4を渡したら4が返ってくること")
  public void test04() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("4");

    assertThat(actual).isEqualTo("4");
  }
}
