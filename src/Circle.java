public class Circle extends GeomFigure {
	private int radius;
	private int center_x;
	private int center_y;
	private String color;

	public Circle(int radius, int center_x, int center_y, String color) {
		this.radius = radius;
		this.center_x = center_x;
		this.center_y = center_y;
		this.color = color;
	}

	public void colorCircle(String new_color) {
		System.out.println("repainting Circle in " + new_color);
		this.color = new_color;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle{" +
				"radius=" + radius +
				", center_x=" + center_x +
				", center_y=" + center_y +
				", color='" + color + '\'' +
				'}';
	}
}
