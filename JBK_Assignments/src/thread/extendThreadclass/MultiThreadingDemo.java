package thread.extendThreadclass;

public class MultiThreadingDemo extends Thread {
	
	public void run() {
		try {
			
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");   	// Displaying the thread that is running

		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
