package _1_2ʹ�ö��߳�._1�̳�Thread��;

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
