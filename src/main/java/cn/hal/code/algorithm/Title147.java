package cn.hal.code.algorithm;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 *
 * topic:  147. 水仙花数
 * url: https://www.lintcode.com/problem/narcissistic-number/description?_from=cat
 *
 * desc: 水仙花数的定义是，这个数等于他每一位数上的幂次之和 见维基百科的定义
 *
 * 比如一个3位的十进制整数153就是一个水仙花数。因为 153 = 13 + 53 + 33。
 *
 * 而一个4位的十进制数1634也是一个水仙花数，因为 1634 = 14 + 64 + 34 + 44。
 *
 * 给出n，找到所有的n位十进制水仙花数。
 *
 * 样例：
 * 例1：
 * 输入: 1
 * 输出: [0,1,2,3,4,5,6,7,8,9]
 *
 *
 * 例2：
 *
 * 输入:  2
 * 输出: []
 * 样例解释: 没有2位数的水仙花数。
 */
@Component
public class Title147 {


  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public List<Integer> solution1(int n) {
    List<Integer> result = new ArrayList<>();
    int start = (int) Math.pow(10, n - 1);
    int end = (int) Math.pow(10, n);

    if (start == 1) {
      start = 0;
    }

    for (int i = start; i < end; i++) {
      if (isNarNum(i)) {
        result.add(i);
      }
    }

    return result;
  }


  private boolean isNarNum(int n) {
    String str = String.valueOf(n);
    char[] chars = str.toCharArray();

    int length = chars.length;
    int[] nums = new int[length];
    for (int i = 0; i < length; i++) {
      nums[i] = chars[i] - '0';
    }

    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += (int) Math.pow(nums[i], length);
    }

    if (sum == n) {
      return true;
    }

    return false;
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
