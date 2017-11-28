class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

public class ColorTV extends TV { // ColorTv�� extends�� TV ���
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);//super�� �̿�
		this.nColors = nColors;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "��ġ " + nColors + "�÷�");//ũ��� ����
	}
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}

