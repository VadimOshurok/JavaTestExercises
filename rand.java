import java.util.Scanner;

public class PlayWithRandom {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		 boolean continueCalculations=true; 
			do {
				System.out.println("Вам надо отгдадать число от 1 до 10");
				int num = getInt();
				int rand = randomGenerator();
				body(num, rand); 
	            System.out.println("Хотите попробывать еще раз? 1.Yes/2.No"); 
	            int input = scanner.nextInt();
				if(input!=1) {
					continueCalculations=false;
	            }
			}
			while(continueCalculations);
	}
	
	public static int randomGenerator() {
		int rand = 1 + (int) (Math.random()*10);
		System.out.println("Программа загадал число: " + rand);
		return rand;
	}
	
	public static int getInt() {
		int num;
		System.out.println("Введите число: ");
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}
		else {
			System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
			scanner.next();
			num = getInt();
		}
		return num;
	}
	public static int body(int rand, int num){
		if (rand == num) {
			System.out.println("Вы угадали число! ");
		}
		else {
			System.out.println("Число не совпало. ");
		}
		return num;
	}

}
