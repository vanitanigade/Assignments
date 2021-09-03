package thread.joinMethod;

public class JoinMethod1 extends Thread {
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		JoinMethod1 t1 = new JoinMethod1();
		JoinMethod1 t2 = new JoinMethod1();
		JoinMethod1 t3 = new JoinMethod1();
		t1.start();
		try {
			t1.join();				//if t1.join removed then all 3 threads will run parallely
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
