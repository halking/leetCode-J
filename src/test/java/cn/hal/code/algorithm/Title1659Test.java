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
public class Title1659Test {

  @Autowired
  private Title1659 title1659;
  private int[] numArr;
  private int[][] target;

  @Before
  public void setUp() throws Exception {
    numArr = new int[]{1, 2, 3, 4, 5, 6};
    target = new int[][]{{1, 2}, {1, 5}};
  }

  @Test
  public void solution1() {
    int[] result = title1659.solution1(numArr, target);
    MatcherAssert.assertThat(result[0], Matchers.is(2));
    MatcherAssert.assertThat(result[1], Matchers.is(5));
  }

  @Test
  public void solution2() {
  }
}