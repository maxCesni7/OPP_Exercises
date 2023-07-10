package org.generation.POO_Dani;

public class Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student estudiante1 = new Student("Daniel","Perez",12, 89, 2009);
			Student estudiante2 = new Student("Luis","Nitales",12, 79, 2009);
			Student estudiante3 = new Student("Ramiro","Lopez",12, 78, 2009);
			
			estudiante1.printFullName();
			
			Courses Ciencias1 = new Courses("Ciencias1","Fernando P.",2010);
			
			Ciencias1.enroll(estudiante1);
			Ciencias1.enroll(estudiante3);
			Ciencias1.enroll(estudiante2);
			
			System.out.println(Ciencias1);
			System.out.println("La mejor calificación del curso es: "+Ciencias1.bestGrade());
			Ciencias1.averageStudents();
			Ciencias1.promedioEstudiante();
			
			
	}

}
