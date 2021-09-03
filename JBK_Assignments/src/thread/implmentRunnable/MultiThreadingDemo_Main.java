package thread.implmentRunnable;

public class MultiThreadingDemo_Main {

	public static void main(String[] args) {
		int n = 8; 			// Number of threads 
		
		for(int i=0; i<8; i++)
		{
			Thread t = new Thread(new MultiThreadingDemo());
			t.start();
		}
	}

}
