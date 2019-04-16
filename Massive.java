package testMenu;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Massive {
	Scanner scanner = new Scanner(System.in);
	
	public void startMassive() {
		boolean continueCalculations=true; 
		do {
			int num0 = getInt();
			int num1 = getInt();
			int num2 = getInt();
			int num3 = getInt();
			int num4 = getInt(); 
			massive(num0,num1,num2,num3,num4);
           	 	System.out.println("Хотите продолжить 1.Yes/2.No"); 
            		int input = scanner.nextInt();
			if(input!=1) {
				continueCalculations=false;
            		}
		}
		while(continueCalculations);	 
	
		}	
	
	public int getInt() {
		System.out.println("Введите число: ");
		int num = 0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}
		return num;
	}
	
	public int[] massive(int num0, int num1, int num2, int num3, int num4) {
		int[] array = {num0, num1, num2, num3, num4};
		int sum = IntStream.of(array).sum();
		System.out.println("Сумма чисел: " + sum);
		return array;
	}
}
