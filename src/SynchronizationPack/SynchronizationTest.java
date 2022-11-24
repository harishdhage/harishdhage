package SynchronizationPack;

public class SynchronizationTest {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		SyncClass sc = new SyncClass();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					sc.counter();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 1000; i++) {
					sc.counter();
				}

			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count - "+sc.count);
	}



}

class SyncClass{
	int count;
	//Non synchronised
	/*public void counter() {
		count++;
	}*/
	
	//Synchronised
	public synchronized void counter() {
		count++;
	}
}
