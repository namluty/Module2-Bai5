package Study;

class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    static class TestCircle {
        public static void main(String[] args) {
            Circle circle1 = new Circle(8.8, "");
            Circle circle2 = new Circle(0, "Blue");
            System.out.println(circle1.getRadius());
            System.out.println(circle2.getColor());
        }
    }
}