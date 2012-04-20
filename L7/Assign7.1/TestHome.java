public class TestHome {

	public static void main (String[] args){
		
		Home home = new Home(1,15, 2000);
	
		System.out.println("Summary Report:\n");
		System.out.println("Home Type:" + HomeType.getTypeDescr(home.getHomeType()));
		System.out.println("Age: " + home.getAge());
		System.out.println("Value: " + home.getValue());
		System.out.println("Commission: " + home.getCommission());

		}

}