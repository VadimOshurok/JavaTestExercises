import java.util.Arrays;

public class program {
	static String text = "\nКак тебя сделать?!";
	static String[] line = {"14", "12", "11"};
	
	public static void main(String[] args) {
		setMassive();
		sortirovka();
		text();
		upperWords();
	}
	
	public static void setMassive() {;
		int i1=0;
		int sum=0;
		for (int i = 0; i < line.length; i++) {
			i1 = Integer.parseInt(line[i]);
			sum += i1;
		}	   
		System.out.print("Сумма чисел в массиве: "+sum); 
		System.out.println("");
	}	
	
	public static void sortirovka() {
		Arrays.sort(line);
		System.out.print("\nСортировка чисел в массиве: ");
		for(int i = 0; i <  line.length; i++) {
			System.out.print("\n" + line[i] + "  ");
		}
		System.out.println("");
	}
	
	public static void text() {
		for (String retval : text.split(" ")) {
           		String[] words = {retval};
            		for (String word : words) System.out.println(word);
		}
	}
	public static void upperWords() {
		String input = text;
		String output = "";
		String[] words = input.split(" ");
		for(String word:words){
			String first = word.substring(0,1).toUpperCase();
			String all = word.substring(1);
			output+=first+all;
		}
		System.out.print(output);
	}
}




