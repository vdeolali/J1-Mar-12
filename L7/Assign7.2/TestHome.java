public class TestHome {

	public static void main (String[] args){
		
		Home home = new Home(1,15, 2000);
		Home home2 = new Home(3, 8, 1500);
		Home home3 = new Home(2, 10, 2500);

		home.setNextHome(home2);
		home2.setNextHome(home3);

		printReport(home,1);
		printReport(home2,2);
		printReport(home3,3);

}
	

	public static void printReport(Home home, int homeNbr){
		System.out.println("\n\n");
		System.out.println("Summary Report for Home #:" + homeNbr);
		System.out.println("Home Type: " + HomeType.getTypeDescr(home.getHomeType()));
		System.out.println("Age: " + home.getAge()+ " YRS");
		System.out.println("Area: " + home.getSqft() + " SQFT");
		System.out.println("Value: $" + home.getValue() );
		System.out.println("Commission: " + home.getCommission());
		}
}