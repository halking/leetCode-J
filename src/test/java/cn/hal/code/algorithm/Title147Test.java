package cn.hal.code.algorithm;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
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
public class Title147Test {

  @Autowired
  private Title147 title147;
  private int[] numArr;
  private int[][] target;

  @Before
  public void setUp() throws Exception {

  }

  @Test
  public void solution1() {
    List<Integer> result = title147.solution1(5);

    log.info("result [{}]", result);
  }
}