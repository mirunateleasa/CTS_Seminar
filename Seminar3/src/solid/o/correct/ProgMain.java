package solid.o.correct;

public class ProgMain {

	public static void main(String[] args) {
		Employee empMada = new FTEEmployee(1, "Mada", 2000);
		System.out.println(empMada.toString() + " BONUS: " + ((FTEEmployee) empMada).calculateBonus());
		
		Employee empJohn = new VendorEmployee (2, "John", 1800);
		System.out.println(empJohn.toString() + " BONUS: " + ((VendorEmployee) empJohn).calculateBonus());
	}

}
