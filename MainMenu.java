package testMenu;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean CCalculationsMain=true;
	do {
		System.out.println("1-калькулятор 2-игра 3-Сложение в массиве");
		int nummer = MenuOperation();
		if (nummer == 1) {
			 
				Calculator l1 = new Calculator();
				l1.startCalculator();
			}	
		if (nummer == 2) { 
				PlayWithRandom play = new PlayWithRandom();
				play.startGame();
		}		
		if (nummer == 3) { 
			Massive m1 = new Massive();
			m1.startMassive();
	}		
		System.out.println("Вернуться в меню? 1.Yes/2.No"); 
		int input = scanner.nextInt();
		if(input!=1) {
		CCalculationsMain=false;
		}
	}
		while(CCalculationsMain);
}
	public static int MenuOperation() {
		int nummer = 0;
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			nummer = scanner.nextInt();
		}
		return nummer;
	}
}



