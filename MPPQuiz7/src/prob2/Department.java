package prob2;

public abstract class Department {
	private String name;
	private StringQueue queue = new StringQueue();
	
	public String getName() {
		return name;
	}
	
	
	public StringQueue getQueue() {
		return queue;
	}
	
	public void addMessage(String msg){
		queue.enqueue(msg);
	}
	public String nextMessage(){
		try {
			return queue.dequeue();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//implement
}
