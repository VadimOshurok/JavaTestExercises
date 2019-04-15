import java.util.Scanner;

public class Menu {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean continueCalculationsMain=true; 
		do {
			System.out.println("1-калькулятор 2-игра");
			int nummer = MenuOperation();
			if (nummer == 1) {
				boolean continueCalculations=true; 
				do { 
					double num1 = getInt();
					double num2 = getInt();
					char operation = getOperation();
					double result = calc(num1,num2,operation);
					System.out.println("Результат операции: "+result); 
					System.out.println("Хотите продолжить 1.Yes/2.No"); 
					int input = scanner.nextInt();
					if(input!=1) {
						continueCalculations=false;
					}
				}
				while(continueCalculations);
			}
			if (nummer == 2) { 
				boolean continueCalculations=true; 
				do {
					System.out.println("Вам надо отгдадать число от 1 до 10");
					int num = getInt2();
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
			System.out.println("Вернуться в меню? 1.Yes/2.No"); 
			int input = scanner.nextInt();
			if(input!=1) {
			continueCalculationsMain=false;
			}
		}
		while(continueCalculationsMain);	
		}
	public static int MenuOperation() {
		int nummer = 0;
		if (scanner.hasNextInt()) {
			nummer = scanner.nextInt();
		}
		return nummer;
	}

	
	public static double getInt() {
		System.out.println("Введите число: ");
		double num = 0.0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();			}
		return num;
	}
	public static char getOperation() {
		System.out.println("Введите операцию: ");
		char operation = 0;
		if(scanner.hasNext()) {
			operation = scanner.next().charAt(0);
		}
		return operation; 
	}
	public static double calc(double num1, double num2, char operation) {
		double result = 0.0;
		switch (operation) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '*':
			result = num1*num2;
			break;
		}
		return result;
	}

	public static int randomGenerator() {
		int rand = 1 + (int) (Math.random()*10);
		System.out.println("Программа загадал число: " + rand);
		return rand;
	}
	
	public static int getInt2() {
		int num;
		System.out.println("Введите число: ");
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}
		else {
			System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
			scanner.next();
			num = getInt2();
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
