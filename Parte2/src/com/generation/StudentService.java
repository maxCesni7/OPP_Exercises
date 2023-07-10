package com.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


//import org.generation.POO_Dani.Student;



public class StudentService
{
	//Lista de cursos: Nombre del curso, matería, creditos y profesor
	public HashMap<String, Course> courseList = new HashMap<>();

    //
    public HashMap<String, Student> students = new HashMap<>();
    
    //Lista individual de estudiantes y los cursos en los que estan inscritos.
    public HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    //Constructor de los servicios a estudiantes, que tambien crean las matrias(Cursos, llamando al constructor).
    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    //Agregas un alumno por el nombre del curso y el id del estudiante. 
    public void enrollStudents( String courseName, String studentID )
    {
    	
        Course course = courseList.get( courseName ); //Al objeto curso lo añade por el nombre del curso.

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {//Si el estudiane no esta en ningun curso crean un nuevo elemento "coursesEnrolledByStudents", para de esa manera añadir al estudiante y crear un objeto lista.
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        //Ahora añade el curso al que el estudiante esta inscrito. 
        coursesEnrolledByStudents.get( studentID ).add( course );
    }
    
    

    //Metodo para eliminar estudiantes de los cursos
    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseName){
        //TODO implement using collections loops
    	//Course course = courseList.get( courseName );
    	
    	System.out.println("Alumnos de  la calse de: "+courseName);
    	
    	//tilizamos el método entrySet() para obtener un conjunto de entradas (claves y valores) de la tabla hash.
    	Set<Map.Entry<String, List<Course>>> entradas = coursesEnrolledByStudents.entrySet();

        // Iterar sobre cada entrada de la tabla hash
        for (Map.Entry<String, List<Course>> entrada : entradas) {
            String clave = entrada.getKey();
            List<Course> lista = entrada.getValue();

            // Iterar sobre los elementos de la lista
            for (Course elemento : lista) {
            	if(elemento.name==courseName) {
            		// Imprimir con la clave del estudiantes
            	System.out.println("Alumno: " + students.get(clave));
            	}
            }
        }
    	
    }

    public void showAllCourses(){
        //TODO implement using collections loops
    	for (String key : courseList.keySet()) {
    	    // ...
    		System.out.println(courseList.get(key));
    	}
    }

    
	public HashMap<String, Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(HashMap<String, Course> courseList) {
		this.courseList = courseList;
	}

	public HashMap<String, Student> getStudents() {
		return students;
	}

	public void setStudents(HashMap<String, Student> students) {
		this.students = students;
	}

	public HashMap<String, List<Course>> getCoursesEnrolledByStudents() {
		return coursesEnrolledByStudents;
	}

	public void setCoursesEnrolledByStudents(HashMap<String, List<Course>> coursesEnrolledByStudents) {
		this.coursesEnrolledByStudents = coursesEnrolledByStudents;
	}

	@Override
	public String toString() {
		return "StudentService [courseList=" + courseList + ", students=" + students + ", coursesEnrolledByStudents="
				+ coursesEnrolledByStudents + "]";
	}
    
    
}
