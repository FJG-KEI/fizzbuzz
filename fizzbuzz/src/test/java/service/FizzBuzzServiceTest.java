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
  @Description("3の倍数を渡したらfizzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual1 = target.fizzBuzz("3");
    String actual2 = target.fizzBuzz("6");
    String actual3 = target.fizzBuzz("9");

    assertThat(actual1).isEqualTo("fizz");
    assertThat(actual2).isEqualTo("fizz");
    assertThat(actual3).isEqualTo("fizz");
  }

  @Test
  @Description("4を渡したら4が返ってくること")
  public void test04() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("4");

    assertThat(actual).isEqualTo("4");
  }

  @Test
  @Description("5を渡したらbuzzが返ってくること")
  public void test05() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("5");

    assertThat(actual).isEqualTo("buzz");
  }

  @Test
  @Description("10を渡したらbuzzが返ってくること")
  public void test06() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("10");

    assertThat(actual).isEqualTo("buzz");
  }

  @Test
  @Description("15を渡したらfizzbuzzが返ってくること")
  public void test07() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("15");

    assertThat(actual).isEqualTo("fizzbuzz");
  }
}