package _1_2ʹ�ö��߳�._3ʵ���������̰߳�ȫ;

public class MyThread3 extends Thread {

	private int count = 5;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 * ��������δ����Ϊ�������������ٽ�����
	 */
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();
		count--;
		System.out.println("��" + MyThread3.currentThread().getName() + "���㣬count="
				+ count);
	}
}
