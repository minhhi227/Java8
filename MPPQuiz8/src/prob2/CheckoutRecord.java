package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> recordEntry;
	
    
	public CheckoutRecord() {
		recordEntry = new ArrayList<CheckoutRecordEntry>();
	}

	public CheckoutRecord(List<CheckoutRecordEntry> recordEntry) {
		this.recordEntry = recordEntry;
	}

	public List<CheckoutRecordEntry> getRecordEntry() {
		return recordEntry;
	}

	public void setRecordEntry(List<CheckoutRecordEntry> recordEntry) {
		this.recordEntry = recordEntry;
	}

   public void addCheckoutEntry(CheckoutRecordEntry entry){
	   this.recordEntry.add(entry);
   }
	
	
	
}
