package cn.hal.code.algorithm;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Ttitle62Test {

  @Autowired
  private Ttitle62 ttitle62;

  @Test
  public void lastRemaining() {
    int result1 = ttitle62.lastRemaining(5, 3);
    MatcherAssert.assertThat(result1, Matchers.is(3));

    int result2 = ttitle62.lastRemaining(10, 17);
    MatcherAssert.assertThat(result2, Matchers.is(2));
  }
}