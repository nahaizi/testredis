package testThead;

public class Thead extends Thread {

	final String[] strarr = new String[1000000]; // strarr[10] = "10";
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thead thead = new Thead();
		thead.dosomething();
		System.out.println("end");
	}

	/**
	 * 
	 */
	public void dosomething() {

		for(int i=0;i<1000000;i++){
			strarr[i] = i+"";
		}

		Thread th = new Thread(new Runnable2());
		th.setName("BBBBBBBBBB");
		th.start();
		Thread th2 = new Thread(new Runnable2());
		th2.setName("AAA");
		th2.start();
		if(th2.isAlive()){
			try {
				th.join(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// @Override
	public class Runnable2 implements Runnable {

		public void run() {
			doanything();
		}
	}
	public synchronized void doanything(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + strarr[i]);
		}
	}
}
