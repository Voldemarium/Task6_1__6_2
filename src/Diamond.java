public class Diamond extends Polygon implements WithAngles, Parallelogram {

	public Diamond(int[][] coordinatesOfVertices) {
		super(4, coordinatesOfVertices);
	}

	@Override
	public void diagonals() {
		double diagonal1 = getSide(coordinatesOfVertices[0], coordinatesOfVertices[2]);
		double diagonal2 = getSide(coordinatesOfVertices[1], coordinatesOfVertices[2]);
		System.out.println("The diagonals of the diamond: " + "diagonal1 = " + diagonal1 + ", diagonal2 = " + diagonal2);
	}

}