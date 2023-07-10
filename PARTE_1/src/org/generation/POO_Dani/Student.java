package org.generation.POO_Dani;

public class Student {
	
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName,String lastName,int registration, int grade, int year) {
    	this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }
    
    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 1);
    }
    
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1);
    }

    public void printFullName(){
        //TODO implement
    	System.out.println("El nombre del estudiante es: "+this.firstName +" "+this.lastName);
     }

     public boolean isApproved(){
         //TODO implement: should return true if grade >= 60
    	 return this.grade>= 60;
    	 //else {return false;}
     }

     public void changeYearIfApproved(){
         //TODO implement: the student should advance to the next year if he/she grade is >= 60
         // Make year = year + 1, and print "Congragulations" if the student has been approved
    	 if (isApproved()==true) {
    		 this.year++; 
    		 System.out.println("Congragulations");}
    
     }

     
     
     
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", grade=" + grade + ", year=" + year + "]";
	}
     
     

	
}
