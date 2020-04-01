package cn.hal.code.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.stereotype.Component;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 *
 * topic: 82. 落单的数
 * url: https://www.lintcode.com/problem/single-number/description
 *
 * desc: 给出 2 * n + 1个数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
 * n≤100
 *
 * 样例：
 * 例1：
 * 输入：[1,1,2,2,3,4,4]
 * 输出：3
 * 解释：
 * 仅3出现一次
 *
 *
 * 例2：
 * 输入：[0,0,1]
 * 输出：1
 * 解释：
 * 仅1出现一次
 *
 *
 * 知识点：
 *
 * 两数相等异或运算等于0
 * X^0 = 0
 * x^x = 0
 * x^y^x = y
 */
@Component
public class Title82 {


  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int solution1(int[] arr) {
    if (arr == null) {
      return -1;
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
        continue;
      }

      map.put(arr[i], 1);
    }

    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue().intValue() == 1) {
        return entry.getKey();
      }
    }

    return -1;
  }


  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int solution2(int[] arr) {
    int calValue = 0;

    for (int i = 0; i < arr.length; i++) {
      calValue ^= arr[i];
    }

    return calValue;
  }

  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public void solution3() {

  }

}
