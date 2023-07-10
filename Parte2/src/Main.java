import com.generation.Student;
import com.generation.StudentNotFoundException;
import com.generation.StudentService;

public class Main{

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.students.put( "1030", new Student( "Carlos", "1030", 31 ) );
        studentService.students.put( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.students.put( "1050", new Student( "Elise", "1020", 26 ) );
        studentService.students.put( "1020", new Student( "Santiago", "1020", 33 ) );

        studentService.enrollStudents( "Math", "1030" );
        studentService.enrollStudents( "Math", "1050" );
        studentService.enrollStudents( "Art", "1040" );
        //studentService.showEnrolledStudents("Math");
        
        System.out.println(studentService);
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math");
        
        
        
    }
}
