public class HomeDerivedData {
    double value;
    double commission;

	HomeDerivedData (){

	}

	HomeDerivedData (double value, double commission){

	}

    public double getValue(){
	return this.value;
    }

    public double getCommission(){
	return this.commission;
    }

     public void  setValue(double val){
	 this.value = val;
    }

    public void setCommission (double com){
	this.commission = com;
    }
}