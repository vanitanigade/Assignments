package thread.priorityOfthread;

public class Demo extends Thread {
	
	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}

	public static void main(String args[]) {
		Demo m1 = new Demo();
		Demo m2 = new Demo();
		m1.setPriority(Thread.MIN_PRIORITY);		//std/default priority = 5
		m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		m2.start();

	}

}
