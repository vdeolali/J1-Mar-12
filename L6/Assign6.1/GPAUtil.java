class GPAUtil
{

    static String[]  validDepts = {"CS","EE","ME"};


    public static String validateCourseIdGrade (String courseIdGrade){
	 String errorMsg = "NO_ERROR";
	 if (courseIdGrade.length() != 6){
	     errorMsg = "Course ID/Grade string invalid, must be 6 char";
	 }else {
	     for (int i = 0 ; i < validDepts.length ; i++){
		 if (courseIdGrade.substring(0,2).equalsIgnoreCase(validDepts[i])){
		     return(errorMsg);
		 } 
	    }
	     errorMsg = "Dept ID invalid, must be one of: CS, EE, ME";
	 }
	 return (errorMsg);
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

    public static void  main (String[] args){
	String str= 	validateCourseIdGrade (args[0]);
	System.out.println (str);
	str= 	validateCourseIdGrade ("ME104A");
	System.out.println (str);
	str= 	validateCourseIdGrade ("EE104A");
	System.out.println (str);
    }
}