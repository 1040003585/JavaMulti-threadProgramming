package _1_2ʹ�ö��߳�._1�̳�Thread��;

public class MyThread3 extends Thread {

	private int i;
	
	public MyThread3(int i){
		super();
		this.i=i;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		System.out.println(i);
	}
}
