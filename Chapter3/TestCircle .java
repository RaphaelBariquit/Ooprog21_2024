public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        a.setRadius(3);
        System.out.println("Circle A:");
        System.out.println("Radius: " + a.getRadius());
        System.out.println("Diameter: " + a.getDiameter());
        System.out.println("Area: " + a.getArea());

        Circle b = new Circle();
        b.setRadius(20);
        System.out.println("\nCircle B:");
        System.out.println("Radius: " + b.getRadius());
        System.out.println("Diameter: " + b.getDiameter());
        System.out.println("Area: " + b.getArea());
        
        Circle c = new Circle(); 
    }
}
