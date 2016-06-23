package _1_2使用多线程;

/**
 * 进程（百度百科）：
 * 进程是操作系统的基础；是一次程序的执行；
 * 是一个程序及其数据在处理机上顺序执行时所发生的活动；
 * 是程度在一个数据集合上运行的过程，它是系统资源分配和调度的一个独立单位。
 * 
 * 线程是进程中独立运行的子任务，多线程可以异步执行。
 * 
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/上午11:50:42
 * Description: 一个进程至少会有一个线程在运行
 */
public class MainThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
/*main
*/