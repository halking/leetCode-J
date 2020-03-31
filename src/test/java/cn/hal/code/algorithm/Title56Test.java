package cn.hal.code.algorithm;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Title56Test {

  @Autowired
  private Title56 title56;
  private int[] numArr;
  private int target;

  @Before
  public void setup() {
    numArr = new int[]{4, 6, 7, 23, 41, 2};
    target = 9;
  }

  @Test
  public void solution1() {
    int[] result = title56.solution1(numArr, target);
    MatcherAssert.assertThat(result[0], Matchers.is(2));
    MatcherAssert.assertThat(result[1], Matchers.is(5));
  }

  @Test
  public void solution2() {
    int[] result = title56.solution2(numArr, target);
    MatcherAssert.assertThat(result[0], Matchers.is(2));
    MatcherAssert.assertThat(result[1], Matchers.is(5));
  }

  @Test
  public void solution3() {
    int[] result = title56.solution3(numArr, target);
    MatcherAssert.assertThat(result[0], Matchers.is(2));
    MatcherAssert.assertThat(result[1], Matchers.is(5));
  }

  @Test
  public void solution4() {
    int[] result = title56.solution4(numArr, target);
    MatcherAssert.assertThat(result[0], Matchers.is(2));
    MatcherAssert.assertThat(result[1], Matchers.is(5));
  }
}