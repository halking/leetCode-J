package cn.hal.code.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 * 两数之和
 *
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 *
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 0 到 n-1。
 */
@Component
public class Title56 {


  /**
   * 暴力法
   * 空间 ：O(n) ； 时间： O(n^2)
   */
  public int[] solution1(int[] numArr, int target) {
    if (numArr == null) {
      throw new IllegalArgumentException("No two sum");
    }

    for (int i = 0; i < numArr.length; i++) {
      for (int j = i + 1; j < numArr.length; j++) {
        if (numArr[i] + numArr[j] == target) {
          return new int[]{i, j};
        }
      }
    }

    throw new IllegalArgumentException("No two sum");
  }

  /**
   * 两遍Hash
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int[] solution2(int[] numArr, int target) {
    if (numArr == null) {
      throw new IllegalArgumentException("No two sum");
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numArr.length; i++) {
      map.put(numArr[i], i);
    }

    for (int i = 0; i < numArr.length; i++) {
      int index = target - numArr[i];
      if (map.containsKey(index) && map.get(index) != i) {
        return new int[]{i, map.get(index)};
      }
    }

    throw new IllegalArgumentException("No two sum");

  }

  /**
   * 一遍Hash
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int[] solution3(int[] numArr, int target) {
    if (numArr == null) {
      throw new IllegalArgumentException("No two sum");
    }

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numArr.length; i++) {
      int index = target - numArr[i];
      if (map.containsKey(index)) {
        return new int[]{map.get(index), i};
      }

      map.put(numArr[i], i);
    }

    throw new IllegalArgumentException("No two sum");
  }

  /**
   * 数组索引
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int[] solution4(int[] numArr, int target) {
    if (numArr == null) {
      throw new IllegalArgumentException("No two sum");
    }

    for (int i = 0; i < numArr.length; i++) {
      int value = target - numArr[i];
      int index = Arrays.binarySearch(numArr, value);
      if (index > 0 && i != index) {
        return i > index ? new int[]{index, i} : new int[]{i, index};
      }

    }

    throw new IllegalArgumentException("No two sum");
  }

}
