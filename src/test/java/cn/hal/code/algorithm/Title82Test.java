package cn.hal.code.algorithm;

import lombok.extern.slf4j.Slf4j;
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
 * @Date: 2020/4/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class Title82Test {

  @Autowired
  private Title82 title82;
  private int[] numArr;

  @Before
  public void setUp() throws Exception {
    numArr = new int[]{1, 1, 2, 2, 3, 4, 4};
  }

  @Test
  public void solution1() {
    int result = title82.solution1(numArr);
    MatcherAssert.assertThat(result, Matchers.is(3));
  }

  @Test
  public void solution2() {
    int result = title82.solution2(numArr);
    MatcherAssert.assertThat(result, Matchers.is(3));
  }

  @Test
  public void solution3() {
  }
}