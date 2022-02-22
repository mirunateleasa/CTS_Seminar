package ro.ase.classes;

public class Main {

	public static void main(String[] args) {
		int [] array = {10, -2, 0, 4, 3, -2, 1};
		
		//making an object (if the functions weren't static)
		Utils utils = new Utils();
		System.out.println("My function object result: " + utils.noOccurenceMin(array));
		System.out.println("Good function object result: " + utils.noOccurenceMinGood(array));
		
		//OR calling the class (if the functions are static)
		System.out.println("My function static result: " + Utils.noOccurenceMin(array));
		System.out.println("Good function static result: " + Utils.noOccurenceMinGood(array));
	}

}
