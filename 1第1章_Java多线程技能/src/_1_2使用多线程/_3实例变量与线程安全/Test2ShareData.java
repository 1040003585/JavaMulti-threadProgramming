package _1_2ʹ�ö��߳�._3ʵ���������̰߳�ȫ;
/**
 * "���̰߳�ȫ"
 * i--:
 * (1)ȡ��ԭ��iֵ
 * (2)����i-1
 * (3)��i���и�ֵ
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/����01:27:37
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
��C���㣬count=2
��B���㣬count=2
��A���㣬count=2
��D���㣬count=1
��E���㣬count=0

*/