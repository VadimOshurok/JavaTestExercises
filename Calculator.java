import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] newNum) {
        System.out.println("Включить калькулятор? 1.Yes/2.No");
		while(true) {
			int str = scanner.nextInt();
			if(str>=2) {
				break;}
			double num1 = getInt();
			double num2 = getInt();
			char operation = getOperation();
			double result = calc(num1,num2,operation);
			System.out.println("Результат операции: "+result); 
            System.out.println("Хотите продолжить 1.Yes/2.No"); 
		}	 
	}
	public static double getInt() {
		System.out.println("Введите число: ");
		double num = 0.0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}
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
}
