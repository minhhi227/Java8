package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private String orderNum ;
	private List<OrderLine> orderLine;
	
	public Order(String num) {
		this.orderNum = num;
		orderLine = new ArrayList<OrderLine>();
		orderLine.add(new OrderLine(this));
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public List<OrderLine> getOrderLine() {
		return orderLine;
	}
	public void setOrderLine(List<OrderLine> orderLine) {
		this.orderLine = orderLine;
	}
	
}
