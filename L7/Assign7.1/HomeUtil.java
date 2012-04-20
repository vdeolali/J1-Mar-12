public class HomeUtil {

    public HomeDerivedData computeDerivedData (Home home){
	HomeDerivedData hdd = new HomeDerivedData(0.0, 0.0);
	
	switch (home.getHomeType()) {
	case 1:
	    hdd.setValue ((30.0*(20-home.getAge())*home.getSqft()));
	    hdd.setValue (30000.0);
	    hdd.setCommission (.06);
	    return (hdd);
	case 2:
	    hdd.setValue ((20.0*(15-home.getAge())*home.getSqft()));
	    hdd.setCommission (.05);
	    return (hdd);
	case 3:
	    hdd.setValue ((10.0*(10-home.getAge())*home.getSqft()));
	    hdd.setCommission (.04);
	    return (hdd);
	}
	return (hdd);
    }

}