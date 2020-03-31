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
public class Title1851Test {

  @Autowired
  private Title1851 title1851;
  private int[] arr;
  private int index;

  @Before
  public void setUp() throws Exception {
    arr = new int[]{1,2,5};
    index = 1;
  }

  @Test
  public void solution1() {
    int result = title1851.solution1(arr, index);
    MatcherAssert.assertThat(result, Matchers.is(4));
  }

  @Test
  public void solution2() {
  }

  @Test
  public void solution3() {
  }
}