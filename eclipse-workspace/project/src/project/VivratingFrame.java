package project;

import javax.swing.*;
public class VivratingFrame extends JFrame implements Runnable
{
	public VivratingFrame()
{
	this.setVisible(true);
	this.setSize(500,400); //자바 팝업창의 크기
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Thread thread = new Thread(this);//쓰레드 함수로 지정
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
new VivratingFrame();//진동함수
}
}

