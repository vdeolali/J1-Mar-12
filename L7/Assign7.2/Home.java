public class Home {

	int homeType;
	int age;
	int sqft;
	HomeDerivedData hd;
	Home nextHome;

	Home (int homeType, int age, int sqft){
		HomeUtil hu = new HomeUtil(this);
		this.homeType = homeType;
		this.age = age;
		this.sqft = sqft;
		hu.computeDerivedData();
		//	System.out.println ("Home:  val" + hd.getValue());
		this.nextHome = null;
    }

	public class HomeUtil {
		Home outer;
		//HomeDerivedData outer.this.hd = new HomeDerivedData(0.0, 0.0);
		HomeUtil(Home outer){
			this.outer = outer;
		}
		
		public void computeDerivedData (){
			outer.hd = new HomeDerivedData(0.0, 0.0);
//			System.out.println ("Switch: " + homeType);
			switch (homeType) {
			case 1:
				hd.setValue ((30.0*(20-age)*sqft));
				hd.setCommission (.06);
				//System.out.println ("Val  " + hd.getValue());
				break;
			case 2:
				hd.setValue ((20.0*(15-age)*sqft));
				hd.setCommission (.05);
				break;
			case 3:
				hd.setValue ((10.0*(10-age)*sqft));
				hd.setCommission (.04);
				break;
			}
		}

		Home getOuter(){
			return (this.outer);
		}
	}
	
	int getHomeType () {
		return this.homeType;
	}

	int getAge () {
		return this.age;
	}

	int getSqft () {
		return this.sqft;
	}

	double getValue (){
		return (this.hd.getValue());
	}

	double getCommission (){
		return (hd.getCommission());
	}

	
	HomeDerivedData getHd(){
		return (this.hd);
	}

	Home getNextHome(){
		return (this.nextHome);
	}

	void setNextHome(Home nextHome){
		this.nextHome = nextHome;
	}
}