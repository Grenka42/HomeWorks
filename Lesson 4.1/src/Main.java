//Home Work 8
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		//Задание 1
		int a = 1;
		int b = 2;
		int cat_count = 3;
		int blue_book = 4;
		int car_black = 5;
		
		//Задание 2
		String text = "Hello";
		
		//Задание 3
		char f = 'П';
		char g = 'Ш';
		
		//Задание 4
		Integer h = 10;
		
		//Задание 5
		double y = 1.75;
		
		//Задание 6
		System.out.println(a);
		System.out.println(b);
		System.out.println(cat_count);
		System.out.println(blue_book);
		System.out.println(car_black);
		System.out.println(text);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(y);
		*/
		
		//Задание 7 и 8
		System.out.println("Калькулятор сложения чисел");
		System.out.println("Укажите первое число:");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("Укажите второе число:");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("Ваш ответ: " + (a + b));
		System.out.println(a + " + " + b + " = " + (a + b));
		
		System.out.println("Калькулятор разность чисел");
		System.out.println("Укажите первое число:");
		double aa = new Scanner(System.in).nextDouble();
		System.out.println("Укажите второе число:");
		double bb = new Scanner(System.in).nextDouble();
		System.out.println("Ваш ответ: " + (aa - bb));
		System.out.println(aa + " - " + bb + " = " + (aa - bb));
		
		System.out.println("Калькулятор частное чисел");
		System.out.println("Укажите первое число:");
		double aaa = new Scanner(System.in).nextDouble();
		System.out.println("Укажите второе число:");
		double bbb = new Scanner(System.in).nextDouble();
		System.out.println("Ваш ответ: " + (aaa / bbb));
		System.out.println(aaa + " / " + bbb + " = " + (aaa / bbb));
		
		
	}

}
