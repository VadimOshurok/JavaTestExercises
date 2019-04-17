package testMenu;
import java.util.Scanner;
import java.util.ArrayList;
public class Massive {
	Scanner scanner = new Scanner(System.in);
	
	public void startMassive() {
		boolean continueCalculations=true; 
		do {
			massive();
           		System.out.println("Хотите продолжить 1.Yes/2.No"); 
            		int input = scanner.nextInt();
			if(input!=1) {
				continueCalculations=false;
        		}
		}
		while(continueCalculations);	 
		}	
	
	public int massive(){
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int total=0;
		boolean continueCalculations=true; 
		do {	
			System.out.println("Введите число: ");
			double num = 0.0;
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
			}
			numbers.add((int) num);
			total += num;
			if(num==0) {
				continueCalculations=false;	
			}
		}
		while(continueCalculations);	
		System.out.println(numbers);
		System.out.println("Сумма чисел составила: "+ total);
		return total;	
		}
}
