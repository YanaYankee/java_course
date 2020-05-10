package ru.stqa.pft.sandbox;

//Весь код оформляется как набор
//классовБ название класса должно совпадать с названием файла
	public class MyFirstProgram {
// внутри класса нужно создать функцию с названием мейн 
		public static void main(String[] args) {
			hello("world");
			hello("Yana");
//
			double l = 5;
			System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
//			System.out.println("2 + 2 =" + 2 + 2);
//			System.out.println("2 + 2 =" + (2 + 2));

			double a = 4;
			double b = 6;

			System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

		}

		public static void hello(String sb) {
			System.out.println("Hello, " + sb + "!");
		}

		public static double area(double len){
			return len * len;
		}
		public static double area(double a, double b){
			return a * b;
		}
		
	}

