package _1_2使用多线程._1继承Thread类;
/**
 * 代码的运行结果与代码顺序或调用顺序无关。
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午12:06:09
 * Description: 
 */
public class Test1Random {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		System.out.println("mainThread 运行结束！");
	}
}
/*
mainThread 运行结束！
MyThread
*/