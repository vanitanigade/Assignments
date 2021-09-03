package thread.getSetnameId;

public class Demo extends Thread {
	
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		Demo t1 = new Demo();
		Demo t2 = new Demo();
		System.out.println("Name of t1:" + t1.getName());	//Thread-0
		System.out.println("Name of t2:" + t2.getName());	//Thread-1
		System.out.println("id of t1:" + t1.getId());
		t1.start();
		t2.start();
		t1.setName("javabykiran");
		System.out.println("After changing name of t1:" + t1.getName());
	}

}
