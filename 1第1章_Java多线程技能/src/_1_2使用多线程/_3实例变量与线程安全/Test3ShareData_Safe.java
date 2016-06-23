package _1_2使用多线程._3实例变量与线程安全;

/**
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午01:35:25
 * Description:
 */
public class Test3ShareData_Safe {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();

		Thread thread = new Thread(myThread3,"A");
		Thread thread2 = new Thread(myThread3,"B");
		Thread thread3 = new Thread(myThread3,"C");
		Thread thread4 = new Thread(myThread3,"D");
		Thread thread5 = new Thread(myThread3,"E");

		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
/*
由A计算，count=4
由D计算，count=3
由C计算，count=2
由B计算，count=1
由E计算，count=0
*/