package prob1;

public class Portfolio extends Undergraduate {
   private Integer hour;

	public Integer getHour() {
		return hour;
	}
	
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	@Override
	public boolean checkCondition() {
		if(this.getHour()>=32) return true;
		else return false;
	
	}
}
