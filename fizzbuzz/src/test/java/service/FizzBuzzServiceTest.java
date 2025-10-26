package service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Description;

public class FizzBuzzServiceTest {

  @Test
  @Description("3と5以外の倍数を渡したら渡した数字が返ってくること")
  public void test01() {
    FizzBuzzService target = new FizzBuzzService();
    String actual1 = target.fizzBuzz("1");
    String actual2 = target.fizzBuzz("2");
    String actual3 = target.fizzBuzz("4");

    assertThat(actual1).isEqualTo("1");
    assertThat(actual2).isEqualTo("2");
    assertThat(actual3).isEqualTo("4");
  }

  @Test
  @Description("3の倍数を渡したらfizzが返ってくること")
  public void test02() {
    FizzBuzzService target = new FizzBuzzService();
    String actual1 = target.fizzBuzz("3");
    String actual2 = target.fizzBuzz("6");
    String actual3 = target.fizzBuzz("9");

    assertThat(actual1).isEqualTo("fizz");
    assertThat(actual2).isEqualTo("fizz");
    assertThat(actual3).isEqualTo("fizz");
  }

  @Test
  @Description("5の倍数を渡したらbuzzが返ってくること")
  public void test03() {
    FizzBuzzService target = new FizzBuzzService();
    String actual1 = target.fizzBuzz("5");
    String actual2 = target.fizzBuzz("10");
    String actual3 = target.fizzBuzz("20");

    assertThat(actual1).isEqualTo("buzz");
    assertThat(actual2).isEqualTo("buzz");
    assertThat(actual3).isEqualTo("buzz");
  }

  @Test
  @Description("15を渡したらfizzbuzzが返ってくること")
  public void test04() {
    FizzBuzzService target = new FizzBuzzService();
    String actual = target.fizzBuzz("15");

    assertThat(actual).isEqualTo("fizzbuzz");
  }
}