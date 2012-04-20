public class HomeType {
    static final int  SINGLE_FAMILY = 1;
    static final int  TOWN_HOME = 2;
    static final int  CONDO = 3;

    static StringBuffer getTypeDescr( int homeType){
	switch (homeType){
	case SINGLE_FAMILY:
//		System.out.println ("HT: SingFam");
		return (new StringBuffer("Single Family"));

	case TOWN_HOME:
		return (new StringBuffer("Town Home"));

	case CONDO:
		return (new StringBuffer("Condo"));

	default:
		System.out.println ("HT: ht = " + homeType);
		return (new StringBuffer("Unknown"));
	}
    }

}