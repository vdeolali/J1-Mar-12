public class Home {

    int homeType;
    int age;
    int sqft;
    double value;
    double commission;

    Home (int homeType, int age, int sqft){
	HomeUtil hu = new HomeUtil();
	this.homeType = homeType;
	this.age = age;
	this.sqft = sqft;
	HomeDerivedData  hdd = hu.computeDerivedData(this);
	this.value = hdd.getValue();
//	System.out.println ("Home: Val  " + hdd.getValue());
	this.commission = hdd.getCommission();
    }

    int getHomeType () {
	return homeType;
    }

    int getAge () {
	return age;
    }

    int getSqft () {
	return sqft;
    }

    double getValue () {
	return value;
    }

     double getCommission () {
	return commission;
    }
}