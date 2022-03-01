package ex1;

public class EmployeeStudent {	//what is an EmployeeStudent? Is it Student or Employee?
	int salaryPerHour;
	int salary;	//this is useless (it depends on hours and salaryPerHour)
	int hours;

	public void reportHours(int addHours) {	//addHours is a variable but is named as a method
		hours += addHours;
		salary = salaryPerHour * hours;
	}

	public int findMaxInsideUnsortedArray(int[] v) throws Exception {	//the function is called findMax but it finds min
		if (v == null || v.length == 0) {								
			throw new Exception("Vector is null");
		}
		int min = v[0];
		for (int i = 1; i < v.length - 1; i = i + 2) {
			if (min > v[i]) {
				min = v[i];
			}
		}
		for (int i = 2; i < v.length; i = i + 2) {
			if (min > v[i]) {
				min = v[i];
			}
		}
		//not DRY = 2 for loops for even/odd, no purpose
		return min;
	}

	public String getExam(int numberExam) throws Exception {	//this is useless and takes a long time (it can be added as a data structure = array, enum, list)
		switch (numberExam) {
		case 1:
			return "OOP Exam";
		case 2:
			return "Java Exam";
		case 3:
			return "Data structure Exam";
		case 4:
			return "C# Exam";
		case 5:
			return "Statistics Exam";

		default:
			throw new Exception("exam must be in range 1 to 5");
		}
	}
}
