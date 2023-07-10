package org.generation.POO_Dani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Courses {
	
	String courseName;
	String professorName;
	int year;
	//Student[] students;
	List<Student> students;
	
	
	 public Courses(String courseName,String professorName,int year) {
	    	this.courseName = courseName;
	        this.professorName = professorName;
	        this.year = year; 
	        this.students = new ArrayList<>();
	        //this.students = new Student[30];
	    }
	
	
	public void enroll(Student student){
		students.add(student);
	    }
	
	 //public void enroll(Student[] students){
	       //TODO add all the students to the collection
	   // }

	    public void ennroll(List<Student> ListStudents){//Recibe una lista de estudiantes para recibir, la lista esta hecha de objetos estudiantes, y de llama ListStudents 
	    	//Overload the enroll method to take in an array of students.
	    	for(Student newStudent: ListStudents) { //Para cada objeto estudiante de la lista ListStudents enrrola "newStudent" como cada uno de los objetos estusiantes mediante la llamada de enrroll
	    		enroll(newStudent);
	    	}
	    }
	    
	    public void unEnroll(Student student){
	        //TODO remove this student from the collection
	        // Hint: check if that really is this student
	    	students.remove(student);
	    }

	    public int countStudents(){
	        //TODO implement
	        return students.size();
	    }
	    
	    public int bestGrade(){
	        //TODO implement
	    	int maxGrade= 0;
	    	for(Student Student: students) {
	    		if(Student.grade>maxGrade) {
	    			maxGrade = Student.grade;
	    		}
	    	}
	        return maxGrade;
	    }
	    
	    //Imprime el promedio de las calificaciones del curso
	    public void averageStudents(){
	        //TODO implement
	    	int calificaciones= 0;
	    	 
	    	for(Student Student: this.students) {
	    		calificaciones +=Student.grade;
	    		}
	    	System.out.println("La calificación promedio de la clase " +this.courseName +" es: " + calificaciones/countStudents());
	    }
	    
	    //Regresa el promedio de las calificaciones del curso
	    public int courseAverage(){
	    	int calificaciones= 0;
	    	 
	    	for(Student Student: this.students) {
	    		calificaciones +=Student.grade;
	    		}
	    	return calificaciones/countStudents();
	    }
	    
	    //Imprime si los estudiiantes estan o no por encima del promedio.
	    public void promedioEstudiante(){
	    	
	    	for(Student Student1: this.students) {
		    		if(Student1.grade >= courseAverage()) {
		    			System.out.println("El estudiante "+ Student1.firstName+ " "+Student1.lastName +" esta por encima del promedio.");
		    		}
		    		else {
		    			System.out.println("El estudiante "+ Student1.firstName+ " "+Student1.lastName +" esta por debajo del promedio.");

		    		}
	    		
	    		}
	        }
	    
	    
	    

	@Override
		public String toString() {
			return "Courses [courseName=" + courseName + ", professorName=" + professorName + ", year=" + year
					+ ", students=" + students + "]";
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
