public class GPA
{

    String[] courseIdGrades;
    String[] courseIds;
    char[] grades;
    double gpa;
    String errorMsg;

    GPA(String[] courseIdGrade){
	int len= courseIdGrade.length;
	courseIdGrades = courseIdGrade;
	courseIds = new String[len];
	grades = new char[len];
	processData();
    }
    
    public static void main(String[] args)
    {
	if (args.length == 0){
	    System.out.println ("Please supply grades to find GPA");
	    
	}
	//	String [] courseIds = new String[args.length]; 
	//	char [] grades  = new char[args.length];
	//	parseInput(args, courseIds, grades);
	//displayResult (courseIds, grades, computeGPA(grades));
	GPA gpa = new GPA(args);
    }

    void processData(){
	parseInput();

	if (errorMsg.equalsIgnoreCase("NO_ERROR")){
	    computeGPA();
	}else {
	    System.out.println ("Input error - details are: " + errorMsg);
	    System.exit(0);
	}
    }
     void displayResult (){
	int i =0;
	System.out.println ("__________________________");
	System.out.println ("Course \t Grade");
	System.out.println ("__________________________");

	for (i =0 ; i < courseIds.length ; i++){
	    System.out.println (courseIds[i]+ "\t   " + grades[i]);
	}
	System.out.println ("__________________________");
        System.out.println(" GPA = " + gpa);
	System.out.println ("__________________________");
    }
    
     void parseInput(){
	int i = 0;
	while (i  <  courseIdGrades.length){
	    errorMsg = GPAUtil.validateCourseIdGrade(courseIdGrades[i]);
	    if (errorMsg.equalsIgnoreCase("NO_ERROR")){
		int strlen = courseIdGrades[i].length();
	    //    	    System.out.println ("Length:"  + strlen); 
	    
		grades[i] = Character.toUpperCase(courseIdGrades[i].charAt (strlen-1));
		courseIds[i] = (courseIdGrades[i].substring (0, strlen -1)).toUpperCase();
		i++;

	    } else {
		i++;
		break; 
	    }
        }
    }
    

     void computeGPA()
    { 
        // 'sum' is a method-level variable
        // (recognized only inside 'computeGPA' method)
        double sum = 0.0;

        for (int i = 0; i < grades.length; i++)
        {
            sum += GPAUtil.gradePoints(grades[i]);
        }
	
        gpa = sum / grades.length;
    }
}