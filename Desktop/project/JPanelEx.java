package project;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelEx extends JFrame {
	class MyPanel extends JPanel {
	public MyPanel() {
	new Thread(new Runnable() {
		public void run() {
			try {
				while( true ) {
				repaint();
				Thread.sleep(400); //400��ŭ run���� �ʴ´�
				}
				} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}).start();
}
	
	public void paintComponent(Graphics g) { 
		Random r = new Random();//�����Լ�����
		int x = r.nextInt(getWidth()-50);
		int y = r.nextInt(getHeight()-50);
		g.clearRect(0, 0, getWidth(), getHeight()); 
		g.drawOval(x, y, 50, 50);
}
}
	public JPanelEx() {
		final MyPanel panel = new MyPanel();
		panel.setFocusable(true);
		setContentPane( panel );
		setSize(300, 300); // ����������
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
}
public static void main(String[] args) {
new JPanelEx();
}
}