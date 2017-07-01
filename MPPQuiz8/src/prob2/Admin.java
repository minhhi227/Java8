package prob2;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		LibraryMember tmp;
		//implement
		for(int i=0;i<members.length;i++){
			tmp = members[i];
			List<CheckoutRecordEntry> checkOutList = tmp.getCheckoutRecord().getRecordEntry();
			for(CheckoutRecordEntry entry:checkOutList){
				if(entry.getItems().equals(item)){
					phoneNums.add(tmp.getPhone());
				}
			}
		}
		
		return phoneNums.stream().sorted().collect(Collectors.toList());
	}
}
