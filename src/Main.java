import university.Grade;
import university.Student;
import university.Subject;

public class Main {

	public static void main(String[] args) {
        System.out.println("Hello, World!");
        var budi = new Student("1234567894", "Budi");
        budi.setIpk(400);
        System.out.println(budi);
        var subject = new Subject("S001", "Code Reenginering",4);
        var grade = new Grade(budi, subject, 85);
        System.out.println(grade);
     }

}
