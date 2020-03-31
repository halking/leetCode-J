package cn.hal.code.algorithm;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @Author: Steven HUANG
 * @Date: 2020/3/31
 *
 * topic: 1851. 购买通行证
 *
 * desc: 亚历克斯计划参观博物馆，并在柜台上购买通行证。管理员决定不一次出售多张通行证，一次只提供一张。如果访客需要一张以上的通行证，
 * 他/她必须再次重新排队到柜台并购买下一张通行证。亚历克斯想购买许多通行证。访客顺序和每位访客需要的通行证数量是已知的，
 * 亚历克斯需要多少时间才能买到所有的通行证？Alex在队列中的位置将被给定，每次交易需要1个时间单位。可以忽略每次转到行后面所需的时间。
 *
 * |arr|<=100000
 * arr[i]<=10000
 *
 * 样例：
 * 例1：
 *
 * 输入:arr=[1,2,5],k=1
 * 输出:4
 * 解释:
 * 有3个人 0,1,2 在排队。亚历克斯的编号是1
 * 第一个时间点，队列为0(1)<-1(2)<-2(5)，编号0获得门票。
 * 第二个时间点，队列为1(2)<-2(5) 亚克斯获得门票，并返回队伍最末端
 * 第三个时间点，队列为2(5)<-1(1) 编号2获得门票，并返回队伍最末端
 * 第四个时间点，队列为1(1)<-2(4) 亚克斯获得门票，他已经买到了所需要的所有门票
 *
 * 例2：
 *
 * 输入:arr=[3,2,1], k = 0,
 * 输出:6
 */
@Component
public class Title1851 {


  /**
   * 空间 ：O(n) ； 时间： O(n)
   */
  public int solution1(int[] arr, int index) {
    if (arr == null || index < 0) {
      return -1;
    }

    if (arr.length == 1) {
      return arr.length;
    }

    List<Integer> dataList = new ArrayList<>(arr.length);

    for (int i = 0; i < arr.length; i++) {
      dataList.add(arr[i]);
    }

    int result = 0;
    int except = dataList.get(index);
    while (except > 0) {
      int item = dataList.remove(0);
      int k = item - 1;
      if (k > 0) {
        dataList.add(k);
      }

      if (item == except) {
        except = k;
      }

      result++;
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
