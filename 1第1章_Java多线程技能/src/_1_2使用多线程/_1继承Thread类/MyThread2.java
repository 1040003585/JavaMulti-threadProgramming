package _1_2使用多线程._1继承Thread类;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for (int i = 0; i < 10; i++) {
			int time = (int) (Math.random() * 1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run="+Thread.currentThread().getName());
		}
	}
}
