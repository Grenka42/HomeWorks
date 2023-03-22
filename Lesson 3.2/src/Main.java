//Home Work 7
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		//Вводим Рубли, а получаем Евро и Доллары
		//Доллар = 76,6 руб., Евро = 81,46 руб. 
		
		System.out.println("Укажите сумму в Рублях:");
		double rub = new Scanner(System.in).nextDouble();
		System.out.println("Доллар = " + (rub * (1 / 76.6)));
		System.out.println("Евро = " + (rub * (1 / 81.46)));
	}

}
