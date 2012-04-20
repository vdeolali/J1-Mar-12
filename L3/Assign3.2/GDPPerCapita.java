public class GDPPerCapita {

    public static void main (String[] args){
	int gdp = 175000;
	int population = 4000;
	double gdpPerCapita = (double) ((double)(gdp)/(double)(population));
	int gdpPerCapitaDollars = (int) gdpPerCapita;
	int gdpPerCapitaCents =  (int) ( 100.0* (gdpPerCapita - (double) gdpPerCapitaDollars));

	System.out.println("GDP: "+"$"+gdp+"\n"+
			   "Population: "+population+"\n"+
			   "GDP Per Capita: "+"$"+gdpPerCapita+"\n"+
			   "GDP Per Capita: "+gdpPerCapitaDollars+ " Dollars" + " and " +gdpPerCapitaCents+" Cents");
	
    }

}