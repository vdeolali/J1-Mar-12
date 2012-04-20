public class Student{

	public static void main(String[] args) {

	//Declare and initialize variables

	int studentID = 101; 

	String firstName ="John", lastName ="Smith";

	String courseID1 = "CS101";
	String courseID2 = "CS102";
	String courseID3 = "CS103";
	String courseID4 = "CS104";

	char studentGrade1='A', studentGrade2='B', studentGrade3='C', studentGrade4='D';

	double gradePoints1 =4.0, gradePoints2 =3.0, gradePoints3 =4.0, gradePoints4 =3.0 ;

	//Compute the GPA
	double gpa = (gradePoints1 + gradePoints2 + gradePoints3 +gradePoints4)/4.0;

	//Display the output


	System.out.println ("Student ID:" + studentID);
	System.out.println ("First Name " + firstName);
	System.out.println ("Last  Name " + lastName);
	System.out.println ("Grades:");
	System.out.println ("____________________________");
	System.out.println ("Course" + "\t" + "Grade" + "\t" + "Points");
	System.out.println ("____________________________");
	System.out.println (courseID1 + "\t" +"  "+ studentGrade1 + "\t" +" " + gradePoints1);
	System.out.println (courseID2 + "\t" +"  "+ studentGrade2 + "\t" +" " + gradePoints2);
	System.out.println (courseID3 + "\t" +"  "+ studentGrade3 + "\t" +" " + gradePoints3);
	System.out.println (courseID4 + "\t" +"  "+ studentGrade4 + "\t" +" " + gradePoints4);

	System.out.println ("____________________________");
	System.out.println ("   " + "GPA:"+gpa);
	System.out.println ("____________________________");

	}

}