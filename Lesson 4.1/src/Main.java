//Home Work 8
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		//������� 1
		int a = 1;
		int b = 2;
		int cat_count = 3;
		int blue_book = 4;
		int car_black = 5;
		
		//������� 2
		String text = "Hello";
		
		//������� 3
		char f = '�';
		char g = '�';
		
		//������� 4
		Integer h = 10;
		
		//������� 5
		double y = 1.75;
		
		//������� 6
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
		
		//������� 7 � 8
		System.out.println("����������� �������� �����");
		System.out.println("������� ������ �����:");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("������� ������ �����:");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("��� �����: " + (a + b));
		System.out.println(a + " + " + b + " = " + (a + b));
		
		System.out.println("����������� �������� �����");
		System.out.println("������� ������ �����:");
		double aa = new Scanner(System.in).nextDouble();
		System.out.println("������� ������ �����:");
		double bb = new Scanner(System.in).nextDouble();
		System.out.println("��� �����: " + (aa - bb));
		System.out.println(aa + " - " + bb + " = " + (aa - bb));
		
		System.out.println("����������� ������� �����");
		System.out.println("������� ������ �����:");
		double aaa = new Scanner(System.in).nextDouble();
		System.out.println("������� ������ �����:");
		double bbb = new Scanner(System.in).nextDouble();
		System.out.println("��� �����: " + (aaa / bbb));
		System.out.println(aaa + " / " + bbb + " = " + (aaa / bbb));
		
		
	}

}
