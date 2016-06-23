package _1_2使用多线程._3实例变量与线程安全;
/**
 * "非线程安全"
 * i--:
 * (1)取得原有i值
 * (2)计算i-1
 * (3)对i进行赋值
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午01:27:37
 * Description:
 */
public class Test2ShareData {

	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();

		Thread thread = new Thread(myThread2,"A");
		Thread thread2 = new Thread(myThread2,"B");
		Thread thread3 = new Thread(myThread2,"C");
		Thread thread4 = new Thread(myThread2,"D");
		Thread thread5 = new Thread(myThread2,"E");

		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
/*
由C计算，count=2
由B计算，count=2
由A计算，count=2
由D计算，count=1
由E计算，count=0

*/