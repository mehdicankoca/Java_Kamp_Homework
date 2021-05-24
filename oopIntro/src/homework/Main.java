package homework;

public class Main {
	
     public static void main(String[] args) {
    	
    	 CourseName java = new CourseName();
    	 java.courseName = "Yazýlým Kursu";
    	 
    	 Instructor mehdi = new Instructor();
    	 mehdi.instructorName = "Mehdi Koca";
    	 
    	 CourseLenght courseLenght = new CourseLenght();
    	 courseLenght.courseLenght = 31;
    	 
    	CourseManager courseManager = new CourseManager();
    	courseManager.addToCourse(java);
    	courseManager.addToInstructor(mehdi);
    	courseManager.deleteToCourse(java);
    	courseManager.deleteToInstructor(mehdi);
    	
     }
}
