import java.util.Locale;
import java.util.Scanner;
import student.student;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		student st = new student();
		
		String name;
		
		System.out.println("Enter student name: ");
		name = sc.nextLine();
		
		st.collector();
		System.out.println("Student result: " + name + ".");
		st.resultAverage(st.sumAverage);
		
		
		
		
		sc.close();
	}

}
