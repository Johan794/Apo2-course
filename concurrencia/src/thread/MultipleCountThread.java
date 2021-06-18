package thread;
import model.MultipleCount;
import ui.Main;
public class MultipleCountThread extends Thread {
	private MultipleCount count;
	private Main main;
	
	public MultipleCountThread(Main ppal , MultipleCount mc) {
		count = mc;
		main = ppal;
	}
	
	public void run() {
		int amountMultiple = count.howManyMultiple();
		main.printAmountOfMultiple(count, amountMultiple);
	}

}
