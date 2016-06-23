package _1_2使用多线程._3实例变量与线程安全;

/**
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午01:19:15
 * Description:
 */
public class Test1UnShareData {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1("A");
		MyThread1 thread2 = new MyThread1("B");
		MyThread1 thread3 = new MyThread1("C");
		thread1.start();
		thread2.start();
		thread3.start();

	}
}
/*
由 A计算，count=4
由 A计算，count=3
由 A计算，count=2
由 A计算，count=1
由 B计算，count=4
由 A计算，count=0
由 B计算，count=3
由 C计算，count=4
由 B计算，count=2
由 C计算，count=3
由 C计算，count=2
由 C计算，count=1
由 C计算，count=0
由 B计算，count=1
由 B计算，count=0
*/