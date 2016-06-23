package _1_2使用多线程._2实现Runnable接口;
/**
 * Java语言的特点就是单根继承，所以为了支持多继承，完全可以实现Runnable接口的方式。
 * 如果要创建的线程类已经有父类了，这时就不能再继承自Thread了，但可以实现Runnable接口来对应这样的情况
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/下午12:28:36
 * Description:
 */
public class Test {

	public static void main(String[] args) {
		
		Runnable runnable=new MyRunnnable();/**/
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("main运行结束");
		
		
	}
}
/*
main运行结束
运行中。。。
*/