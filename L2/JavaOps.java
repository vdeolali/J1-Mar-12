public class JavaOps {

	public JavaOps() {
		int x, y = 10, z = 5; 
		int i = 1; int j = 2;
		x = ++z; 
		j = i++;
		i += ++j;

		System.out.println ("++ means"+  "x="+ x+ "and z=" + z);
		System.out.println ("i =" + i + "j = "+j);
	}



	public static void main(String args[]){
	 new  JavaOps();

	} 
}