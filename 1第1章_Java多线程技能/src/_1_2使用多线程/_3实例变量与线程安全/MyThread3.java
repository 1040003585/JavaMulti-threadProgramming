package _1_2使用多线程._3实例变量与线程安全;

public class MyThread3 extends Thread {

	private int count = 5;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 * 加锁的这段代码称为“互斥区”或“临界区”
	 */
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		count--;
		System.out.println("由" + MyThread3.currentThread().getName() + "计算，count="
				+ count);
	}
}
