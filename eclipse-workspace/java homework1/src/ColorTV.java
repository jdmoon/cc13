class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

public class ColorTV extends TV { // ColorTv의 extends로 TV 상속
	private int nColors;
	public ColorTV(int size, int nColors) {
		super(size);//super을 이용
		this.nColors = nColors;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + nColors + "컬러");//크기와 색깔
	}
	
	public static void main(String [] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}

