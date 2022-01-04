package test9t;

public class Java96 {
	public static void main(String[] args) {
		StopWatch t = new StopWatch();
		t.start();
		for(int i = 0; i < 10000000; i++)
		t.stop();
		System.out.println(t.getElapsedTime());
	}
}
class StopWatch{
	private long startTime;
	private long endTime;
	StopWatch(){
		startTime = System.currentTimeMillis();
	}
	void start() {
		startTime = System.currentTimeMillis();
	}
	void stop() {
		endTime = System.currentTimeMillis();
	}
	long getElapsedTime() {
		return (endTime - startTime) * 1000;
	}
}
