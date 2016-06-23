package _1_2使用多线程._1继承Thread类;

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
