package adapter;

public class Student {
	Pen p;
	
	public Pen getPen() {
		return this.p;
	}
	
	public void setPen(Pen p) {
		this.p = p;
	}
	
	public void Write() {
		System.out.println("Happy to have the pen.");
	}
}
