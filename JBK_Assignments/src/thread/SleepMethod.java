package thread;

public class SleepMethod extends Thread {
	
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		SleepMethod t1 = new SleepMethod();
		SleepMethod t2 = new SleepMethod();
		t1.start();								//try by adding t1.join(); then 1st thread will run first i.e. 1 2 3 4 5  then 2nd
		t2.start();
	}

}
