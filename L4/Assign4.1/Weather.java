public class Weather{

    public static void main (String[] argc){
	int   i =1;
	double temp = 0.0;
	final double ANNUAL_INCREASE = 1.0;
	double uncertainty = 0.0;
	String result="";

	System.out.println ("Year \t Jan \t Feb \t Mar \t Apr  \t May \t Jun \t July  \t Aug \t Sep \t Oct \t Nov \t Dec");

	while (true){

	    if (i == 3) { i++; continue;}
	    else if (i > 5) break;
	    else {
		switch (i){
		    case 1:
			uncertainty = 2.1 ;
			result = "  " + i + "  ";
			for (int j = 1; j < 13; j++){
			    temp = (j == 1 || j == 2 || j ==11 || j == 12) ? j +3: ( 5*j + 7);
			    temp += (int) uncertainty*temp/100; 
			    result += "\t"+ "  " +(int) temp; 
			}
			System.out.println (result);

			break; 
		    case 2:
			uncertainty = 4.3 
;			result = "  " + i + "  ";
			for (int j = 1; j < 13; j++){
			    temp = (j == 1 || j == 2 || j ==11 || j == 12) ? j +3: ( 5*j + 7);
			    temp += i * ANNUAL_INCREASE; 
			    temp += (int) uncertainty*temp/100; 
			    result += "\t"+ "  " +(int) temp;  
			}
			
			System.out.println (result);
			break;

		    case 4:
			uncertainty = 7.4 ;
			result = "  " + i + "  ";
			for (int j = 1; j < 13; j++){
			    temp = (j == 1 || j == 2 || j ==11 || j == 12) ? j +3: ( 5*j + 7);
			    temp += i* ANNUAL_INCREASE; 
			    temp += (int) uncertainty*temp/100; 
			    result += "\t"+ "  " +(int) temp;

			}
			System.out.println (result);
			break;

		    case 5:
			uncertainty = 8.6 ;
			result = "  " + i + "  ";
			for (int j = 1; j < 13; j++){
			    temp = (j == 1 || j == 2 || j ==11 || j == 12) ? j +3: ( 5*j + 7);
                        temp += i* ANNUAL_INCREASE; 
			temp += (int) uncertainty*temp/100; 
			result += "\t"+ "  " +(int) temp; 

			}
	                System.out.println (result);
			break;
		}
				
	    } //if
	    i++;
       	} //while
	
    }

}