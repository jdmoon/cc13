package project;

import javax.swing.*;
public class VivratingFrame extends JFrame implements Runnable
{
	public VivratingFrame()
{
	this.setVisible(true);
	this.setSize(500,400); //�ڹ� �˾�â�� ũ��
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Thread thread = new Thread(this);//������ �Լ��� ����
	thread.start();
}
@Override
public void run()
	{
while(true)
	{
		int rx = (int)(Math.random()*10);
		int ry = (int)(Math.random()*10);
		this.setLocation(200+rx, 200+ry);
	}
}
public static void main(String arg[])
{
new VivratingFrame();//�����Լ�
}
}

