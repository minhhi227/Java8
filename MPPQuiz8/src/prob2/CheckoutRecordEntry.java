package prob2;

import java.time.LocalDate;
import java.util.Date;

public class CheckoutRecordEntry {
	private LendingItem items;
    private ItemType type;
    private LocalDate checkoutDate ;
    private LocalDate dueDate ;
    
    
    
	public CheckoutRecordEntry(LendingItem items, LocalDate checkoutDate, LocalDate dueDate, ItemType type ) {
		this.items = items;
		this.type = type;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LendingItem getItems() {
		return items;
	}
	public void setItems(LendingItem items) {
		this.items = items;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
    
	
}
