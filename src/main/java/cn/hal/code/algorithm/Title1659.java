package cn.hal.code.algorithm;

import org.springframework.stereotype.Component;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 *
 * 合法数统计II
 *
 * 给出n个数和m个询问，每个询问包含两个整数L,R，对于每个询问输出有多少数满足取值范围在[L, R]
 *
 * 样例1：
 * 输入：a=[1,2,3,4,5,6],q=[[1,2],[1,5]]
 * 输出： [2,5]
 * 说明：
 * 对于第一个询问，a[0],a[1]是合法的
 * 对于第二个询问，a[0],a[1],a[2],a[3],a[4] 是合法的
 *
 * 样例2：
 * 输入：a=[1,5,3,3,3,2],q=[[1,2]]
 * 输出：[2]
 * 说明：
 * 对于询问，只有a[0],a[5]合法
 */
@Component
public class Title1659 {

  /**
   * 暴力法
   * 空间 ：O(n) ； 时间： O(n^2)
   */
  public int[] solution1(int[] source, int[][] requireData) {
    if (requireData == null || source == null) {
      return new int[]{};
    }

    int[] result = new int[requireData.length];
    for (int i = 0; i < requireData.length; i++) {
      int[] cols = requireData[i];
      for (int k = 0; k < source.length; k++) {
        if (source[k] >= cols[0] && source[k] <= cols[1]) {
          result[i] += 1;
        }
      }
    }

    return result;
  }


  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public void solution2() {

  }

  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public void solution3() {

  }

}
