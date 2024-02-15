import java.io.FileInputStream;
import java.util.Scanner;

import university.Student;

//import university.Grade;
//import university.Student;
//import university.Subject;
//import university.UniversalSubject;

public class Main {

	public static void main(String[] args) {
//        var budi = new Student("1234567894", "Budi");
//        budi.setIpk(400);
//        System.out.println(budi);
//        var subject = new Subject("S001", "Code Reengineering",4);
//        var grade = new Grade(budi, subject, 85);
//        System.out.println(grade);
//        
//        var universal = new UniversalSubject("S001", "Code Reengineering", 4, "CODERE001");
//        var gradeUniversal = new Grade(budi, universal, 90);
//        System.out.println(gradeUniversal);

		// read file students
		try {
			var scanner = new Scanner(new FileInputStream("data/students.csv"));
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] res = line.split("\t");
				if (res.length == 3) {
					var newStudent = new Student(res[0], res[1]);
					newStudent.setIpk(Integer.parseInt(res[2]));
					System.out.println(newStudent);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
