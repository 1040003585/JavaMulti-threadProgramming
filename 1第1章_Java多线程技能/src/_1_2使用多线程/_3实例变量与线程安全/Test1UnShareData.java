package _1_2ʹ�ö��߳�._3ʵ���������̰߳�ȫ;

/**
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/����01:19:15
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
�� A���㣬count=4
�� A���㣬count=3
�� A���㣬count=2
�� A���㣬count=1
�� B���㣬count=4
�� A���㣬count=0
�� B���㣬count=3
�� C���㣬count=4
�� B���㣬count=2
�� C���㣬count=3
�� C���㣬count=2
�� C���㣬count=1
�� C���㣬count=0
�� B���㣬count=1
�� B���㣬count=0
*/