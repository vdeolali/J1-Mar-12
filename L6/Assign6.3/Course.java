public class Course{

    String  courseId;
    String  courseTitle;
    int     creditHours;

    Course (){
	courseId = "";
	courseTitle = "";
	creditHours = 0;
    }

    Course (String courseId, String courseTitle, int creditHours){
	//	System.out.println ("Created Object\n");
	this.courseId = courseId;
	this.courseTitle = courseTitle;
	this.creditHours = creditHours;
    }

    void printCourse (){
	System.out.println (courseId + "\t" + courseTitle + "\t\t" + creditHours +"\n");
    }
}