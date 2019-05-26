package triangle;

import java.util.HashSet;

public class Triangles {
    private HashSet triangle = new HashSet();

    public void addTriangles() {

        triangle.add(new Triangle(new Point(6, 6), new Point(6, 6), new Point(6, 6)));
        triangle.add(new Triangle(new Point(5, 3), new Point(3, 5), new Point(2, 2)));
        triangle.add(new Triangle(new Point(0, 0), new Point(1, 1), new Point(2, 2)));
        triangle.add(new Triangle(new Point(2, 2), new Point(3, 4), new Point(4, 2)));
    }
}
