package _1_2ʹ�ö��߳�._3ʵ���������̰߳�ȫ;

/**
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/����01:35:25
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
��A���㣬count=4
��D���㣬count=3
��C���㣬count=2
��B���㣬count=1
��E���㣬count=0
*/