public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(50, 66, 76, "Red");
		circle.colorCircle("Blue");
		System.out.println(circle);
		System.out.println("The perimeter of the circle = " + circle.getPerimeter());
		System.out.println("The area of the circle = " + circle.getArea());

		Triangle triangle = new Triangle(1, 1, 100, 20, 55, 80);
		System.out.println(triangle);
		double AB = Triangle.getSide(triangle.getA(), triangle.getB());
		System.out.println("AB = " + AB);
		System.out.println("The perimeter of the triangle = " + triangle.getPerimeter());
		System.out.println("The height on the AB = " + triangle.getHeight(AB));
		System.out.println("The area of the triangle = " + triangle.getArea());


	}
}