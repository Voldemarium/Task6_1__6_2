import java.util.Arrays;

public class Triangle extends GeomFigure {
	private int[] A;
	private int[] B;
	private int[] C;

	public Triangle(int A_x, int A_y, int B_x, int B_y, int C_x, int C_y) {
		A = new int[]{A_x, A_y};
		B = new int[]{B_x, B_y};
		C = new int[]{C_x, C_y};
	}

	public Triangle(int[] A, int[] B, int[] C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}

	public int[] getA() {
		return A;
	}

	public int[] getB() {
		return B;
	}

	public int[] getC() {
		return C;
	}

	@Override
	public double getPerimeter() {
		return getSide(A, B) + getSide(B, C) + getSide(A, C);
	}

	@Override
	public double getArea() {
		return 0.5 * getSide(A, B) * getHeight(getSide(A, B));
	}

	public double getHeight(double AB) {
		double p = getPerimeter() / 2;
		return 2 / AB * Math.sqrt(p * (p - getSide(A, B)) * (p - getSide(B, C)) * (p - getSide(A, C)));
	}

	@Override
	public String toString() {
		return "Triangle{" +
				"A=" + Arrays.toString(A) +
				", B=" + Arrays.toString(B) +
				", C=" + Arrays.toString(C) +
				'}';
	}
}