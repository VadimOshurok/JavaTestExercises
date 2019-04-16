package testMenu;
import java.util.Scanner;
import java.util.stream.IntStream;
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
	
	public int[] massive(){
		System.out.println("Введите длину массива: ");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Введите элементы массива: ");
		for (int i=0; i<size; i++) {
			array[i] = scanner.nextInt();
		}
		int sum = IntStream.of(array).sum();
		System.out.println("Сумма чисел: " + sum);
		return array;
	}
}