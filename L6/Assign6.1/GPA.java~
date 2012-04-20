class GPA
{
    public static void main(String[] args)
    {
	if (args.length == 0){
	    System.out.println ("Please supply grades to find GPA");
	    
	}
	String [] courseIds = new String[args.length]; 
	char [] grades  = new char[args.length];
	parseInput(args, courseIds, grades);
	displayResult (courseIds, grades, computeGPA(grades));
    }


    static void displayResult (String[] courseIds, char[] grades, double gpa){
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
    
    public static void parseInput(String[] courseIdGrades, String[] courseIds, char[] grades){
	int i = 0;
	int numArgs = courseIdGrades.length;
	while (i  <  numArgs){
	    int strlen = courseIdGrades[i].length();
	    //    	    System.out.println ("Length:"  + strlen); 
	    
	    grades[i] = Character.toUpperCase(courseIdGrades[i].charAt (strlen-1));
	    courseIds[i] = (courseIdGrades[i].substring (0, strlen -1)).toUpperCase();
	    i++;
        }
    }
    
    public static int gradePoints (char grade){
	switch (grade){
	case 'A':
	    return (4);
	case 'B':
	    return (3);
	case 'C':
	    return (2);
	case 'D':
	    return (1);
	case 'F':
	    return (0); 
        default:
            System.out.println ("gradePoints: Bad Input");
            return (-1);
	}
    }
    static double computeGPA(char[] grades)
    { 
        // 'sum' is a method-level variable
        // (recognized only inside 'computeGPA' method)
        double sum = 0.0;

        for (int i = 0; i < grades.length; i++)
        {
            sum += gradePoints(grades[i]);
        }
        double gpa = sum / grades.length;
        return gpa;
    }
}