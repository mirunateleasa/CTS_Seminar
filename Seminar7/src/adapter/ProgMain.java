package adapter;

public class ProgMain {

	public static void main(String[] args) {
		Pen penFav = new PenAdapter();
		Student s = new Student();
		s.setPen(penFav);
		s.Write();
	}

}
