package methodReference;

public class StaticMethodReference2 {
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(StaticMethodReference2::ThreadStatus);
		t2.start();
	}
}