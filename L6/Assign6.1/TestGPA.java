class TestGPA
{
    public static void main(String[] args)
    {

	if (args.length == 0){
	    System.out.println ("Please supply grades to find GPA");
	    System.exit(0);
	}
	GPA gpa = new GPA(args);
	gpa.displayResult();
    }


}