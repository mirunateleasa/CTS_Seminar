package ex1;

public class CorrectClass {
	int salaryPerHour;
	int hours;

	public void reportHours(int hoursToAdd) {
		hours += hoursToAdd;
	}

	public int calculateSalary(int nrHours) {
		return salaryPerHour * hours;
	}

	public int findMinInsideUnsortedArray(int[] v) throws Exception {
		if (v == null || v.length == 0) {
			throw new Exception("Vector is null");
		}
		int min = v[0];
		for (int i = 1; i < v.length; i++) {
			if (min > v[i]) {
				min = v[i];
			}
		}
		return min;
	}

	public String getExam(int numberExam) throws Exception {
		String []exams = {"OOP Exam", "Java Exam" , "Data Structures Exam", "C# Exam", "Statistics Exam"};
		if (numberExam >= exams.length)
		{
			throw new Exception ("exam must be in range 1 to 5");
		}
		else
		{
			return exams[numberExam];
		}
	}
}
