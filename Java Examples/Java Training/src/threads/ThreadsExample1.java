package threads;

class ThreadClass implements Runnable {

	@Override
	public void run() {
		System.out.println("thread started running ...");
		System.out.println("thread executed from implemention class from runnable ");
	}
	
	public void run(int number) {
		System.out.println(number);
//		System.out.println("thread started running ...");
//		System.out.println("thread executed from implemention class from runnable ");
	}
	
}

class ThreadClass2 extends Thread {

	@Override
	public void run() {
		System.out.println("thread started running ...");
		System.out.println("thread executed from exetended class from Thread ");

	}
	
}

public class ThreadsExample1 {

	public static void main(String[] args) {
		ThreadClass th = new ThreadClass();
		th.run(100);
		Thread thread = new Thread(th);
		thread.start();
		
		ThreadClass2 th2 = new ThreadClass2();
		th2.start();
	}
}
