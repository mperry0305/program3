
public class LacationRecord {
  
	private int
		ageYears,
		ageMonths,
		milkDays,
		milkPound;
	
	private double 
		bFPercent,
		bFatP;
		
	
	private double
		bFatP = bFPercent
	
	
	public LactationRecord (int aY, int aM, int mD,int mP, double bFP){
		ageYears = aY;
		ageMonths = aM;
		milkDays = mD;
		milkPounds = mP;
		bFPercent = bFP;
		
	}
	
	public String toString(){
		return(String.format("%2d",ageYears + '-' + "%02d",ageMonths + ' ' + "%5.2f",milkDays + ' ' + "%")
	}
	//protected LactationRecord(int age, int milkMonths, int milkPounds, int butterFat)
		
}
