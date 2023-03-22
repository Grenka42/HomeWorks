//Home Work 6
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		//Пользователь вводит темпиратуру в C, а получает F
		//(F = C * 1.8 + 32)
		
		System.out.println("Укажите темпиратуру в Цельсиях:");
		double A = new Scanner(System.in).nextDouble();
		System.out.println("F = " + (A * 1.8 + 32));
	}

}
