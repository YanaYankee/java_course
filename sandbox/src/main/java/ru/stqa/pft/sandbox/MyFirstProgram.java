package ru.stqa.pft.sandbox;

//Весь код оформляется как набор
//классовБ название класса должно совпадать с названием файла
	public class MyFirstProgram {
// внутри класса нужно создать функцию с названием мейн 
		public static void main(String[] args) {

			hello("world");
			hello("Yana");
// create object of Square type
			Square s = new Square(5); // attribute with constructor
//			 s.l = 5; without constructor
			System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

			Rectangle r = new Rectangle(4,6);
//			 r.a = 4; without constructor
//			 r.b = 6;without constructor
			System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());



			Point p1 = new Point(1,1);
			Point p2 = new Point(2,2);

			public static double distance (Point p1, Point p2) {
				double d = Math.sqrt(Math.pow(p1.x1 - p2.x1, 2) + Math.pow(p1.y1 - p2.y1, 2));
				return d;
			}

			System.out.println(
					"Расстойние между точкой p1 с координатами (" + p1.x1 + ", " + p1.y1 +
							") и ("  + p2.x1 + ", " + p2.y1 + ") равно " + distance(p1,p2));






		}







//	public static double distance(Point p1, Point p2)

		public static void hello(String sb) {
			System.out.println("Hello, " + sb + "!");
		}
// later argument changed to those of object
//		public static double area(double len){
// the func moved to class as method
//		public static double area(Square s){
//			return s.l * s.l;
//		}
//		public static double area(Rectangle r){
//			return r.a * r.b;
//		}
		
	}

