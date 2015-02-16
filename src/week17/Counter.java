package week17;

public class Counter {
	private int n = 0;
	
	//to get correct output form multiple threads
	//we need to create an object for lock acquire
	private Object obj = new Object();
	public void increase(){
		synchronized (obj){
			n++;
		}
		
	}
	
	
	/* this method doesn't always work
	public synchronized void increase(){
		n++;
	}
	*/
	public int getCount(){
		return n;
	}

}
