public class Task1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task1.run()---> Hello");

	}
	public static void main(String[] args) {
		Task1 task1 = new Task1();
		Thread t1 = new Thread(task1);
		t1.start();
	}
}
