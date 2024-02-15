import university.Grade;
import university.Student;
import university.Subject;
import university.UniversalSubject;

public class Main {

	public static void main(String[] args) {
        var budi = new Student("1234567894", "Budi");
        budi.setIpk(400);
        System.out.println(budi);
        var subject = new Subject("S001", "Code Reengineering",4);
        var grade = new Grade(budi, subject, 85);
        System.out.println(grade);
        
        var universal = new UniversalSubject("S001", "Code Reengineering", 4, "CODERE001");
        var gradeUniversal = new Grade(budi, universal, 90);
        System.out.println(gradeUniversal);
     }

}
