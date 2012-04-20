public class Max{

    private static int findMax(String[] numList){
	int max = 0;
	    for (int i = 0; i < numList.length; i++){
		     System.out.print(numList[i] + " ");
		     max = (Integer.parseInt(numList[i]) > max)? Integer.parseInt(numList[i]): max ;
		 }
	    return (max);
    }
    
    public static void main(String[] args){
	if (args.length > 0){
	    System.out.print("The input values are:\t");
	    // System.out.println("Received " + args.length + "  args"); 

    	    System.out.println("\nThe Max value is:\t" + findMax(args)); 

	    
	}else {
	    System.out.println ("Got Args?");
	    System.exit(0);
	}
    }
}