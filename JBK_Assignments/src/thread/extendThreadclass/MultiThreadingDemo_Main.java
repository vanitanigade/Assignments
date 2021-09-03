package thread.extendThreadclass;

public class MultiThreadingDemo_Main {

	public static void main(String[] args) {
		
		int n = 8; 		// Number of threads 
		
		for (int i=0; i<8; i++){
			
			MultiThreadingDemo object = new MultiThreadingDemo();
			object.start();
		}
	}

}
