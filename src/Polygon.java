import java.util.Arrays;

public class Polygon extends GeomFigure implements WithAngles {

	int numberOfVertices;

	int[][] coordinatesOfVertices;

	public Polygon(int numberOfVertices, int[][] coordinatesOfVertices) {
		this.numberOfVertices = numberOfVertices;
		if (coordinatesOfVertices.length == numberOfVertices) {
			this.coordinatesOfVertices = coordinatesOfVertices;
		} else {
			System.out.println("The number of coordinates does not correspond to the number of vertices!");
		}
	}

	@Override
	public double getPerimeter() {
		double perimeter = 0.0;
		for (int i = 0; i < coordinatesOfVertices.length; i++) {
			if (i == coordinatesOfVertices.length - 1) {
				perimeter += getSide(coordinatesOfVertices[i], coordinatesOfVertices[0]);
			} else {
				perimeter += getSide(coordinatesOfVertices[i], coordinatesOfVertices[i + 1]);
			}
		}
		return perimeter;
	}

	@Override
	public double getArea() {
		//разобьем многоугольник на треугольники и сложим их площади
		double area = 0;
		for (int i = 0; i < coordinatesOfVertices.length - 2; i++) {
			Triangle triangle = new Triangle(
					coordinatesOfVertices[0],
					coordinatesOfVertices[i + 1],
					coordinatesOfVertices[i + 2]
			);
			area += triangle.getArea();
		}
		return area;
	}

	@Override
	public void coordinatesOfAllVertices() {
		if (coordinatesOfVertices != null) {
			System.out.println(Arrays.deepToString(coordinatesOfVertices));
		} else {
			System.out.println("the coordinate array is empty");
		}
	}
}
