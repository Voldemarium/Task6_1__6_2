public abstract class GeomFigure {
	public abstract double getPerimeter ();
	public abstract double getArea ();

	public static double getSide(int[]A, int[]B) {
		double side = 0;
		if (A.length == 2) {
			side = Math.sqrt(Math.pow(Math.abs(B[0] - A[0]), 2) + Math.pow(Math.abs(B[1] - A[1]), 2));
		} else {
			System.out.println("The size of the array must be equal to 2!");
		}
		return side;
	}
}
