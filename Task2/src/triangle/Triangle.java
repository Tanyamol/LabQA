package triangle;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;
    double side1;
    double side2;
    double side3;


    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        identifyTriangle();

    }

    private void countSides() {
        side1 = Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) + (point2.getY() - point1.getY()) * (point2.getY() - point1.getY()));
        side2 = Math.sqrt((point3.getX() - point1.getX()) * (point3.getX() - point1.getX()) + (point3.getY() - point1.getY()) * (point3.getY() - point1.getY()));
        side3 = Math.sqrt((point3.getX() - point2.getX()) * (point3.getX() - point2.getX()) + (point3.getY() - point2.getY()) * (point3.getY() - point2.getY()));
    }

    private boolean checkOnTriangle() {
        countSides();
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            System.out.println(" Triangle is: ");
            return true;
        } else {
            return false;
        }
    }

    public void identifyTriangle() {
        if (checkOnTriangle() == true) {
            if (side1 == side2 && side2 == side3) {
                System.out.println(" equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println(" isosceles");
            } else {
                System.out.println(" versatile");
            }
        } else {
            System.out.println("It's not a triangle");
        }
    }

}
