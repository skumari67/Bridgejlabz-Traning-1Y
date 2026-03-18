package level1;


class Circle {
    double radius;

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }

    void circumference() {
        double c = 2 * Math.PI * radius;
        System.out.println("Circumference: " + c);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        c.area();
        c.circumference();
    }
}