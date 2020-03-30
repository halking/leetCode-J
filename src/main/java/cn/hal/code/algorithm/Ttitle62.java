package cn.hal.code.algorithm;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/30
 */

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 圆圈中最后剩下的数字
 */
@Component
public class Ttitle62 {

  public int lastRemaining(int n, int m) {
    if (n < 1 || n > 100000) {
      return -1;
    }

    if (m < 1 || m > 1000000) {
      return -1;
    }

    List<Integer> dataList = new ArrayList(n);
    for (int i = 0; i < n; i++) {
      dataList.add(i);
    }

    int deletedIndex = 0;
    while (n > 1) {
      deletedIndex = (deletedIndex + m - 1) % n;
      dataList.remove(deletedIndex);
      n--;
    }

    return dataList.get(0);
  }

  /**
   * 约瑟夫环——公式法（递推公式）
   */
  public int lastRemaining2(int n, int m) {
    int p = 0;
    for (int i = 2; i <= n; i++) {
      p = (p + m) % i;
    }

    return p + 1;
  }

}
