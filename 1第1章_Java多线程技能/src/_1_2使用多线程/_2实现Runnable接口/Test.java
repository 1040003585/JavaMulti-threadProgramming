package _1_2ʹ�ö��߳�._2ʵ��Runnable�ӿ�;
/**
 * Java���Ե��ص���ǵ����̳У�����Ϊ��֧�ֶ�̳У���ȫ����ʵ��Runnable�ӿڵķ�ʽ��
 * ���Ҫ�������߳����Ѿ��и����ˣ���ʱ�Ͳ����ټ̳���Thread�ˣ�������ʵ��Runnable�ӿ�����Ӧ���������
 * Copyright? 2016 Authors. All rights reserved.
 *
 * FileName: 
 * @author: Wu_Being<1040003585@qq.com>
 * Date/Time: 2016-6-23/����12:28:36
 * Description:
 */
public class Test {

	public static void main(String[] args) {
		
		Runnable runnable=new MyRunnnable();/**/
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("main���н���");
		
		
	}
}
/*
main���н���
�����С�����
*/