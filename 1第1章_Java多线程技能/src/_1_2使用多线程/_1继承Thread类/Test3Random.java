package _1_2使用多线程._1继承Thread类;
/**
 * start()不是立即启动
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午12:22:19
 * Description:
 */
public class Test3Random {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3(1);
		MyThread3 t2 = new MyThread3(2);
		MyThread3 t3 = new MyThread3(3);
		MyThread3 t4 = new MyThread3(4);
		MyThread3 t5 = new MyThread3(5);
		MyThread3 t6 = new MyThread3(6);
		MyThread3 t7 = new MyThread3(7);

		t.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		
	}
}
/*
1
3
5
7
2
4
6

*/