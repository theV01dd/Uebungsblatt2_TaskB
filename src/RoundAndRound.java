public class RoundAndRound {
    public static void main(String[] args) {
ü        Circle circle1 = new Circle();
        double constant = 5.1; 
        double constant2 = 17.3;
        circle1.radius = constant;
        // calculate the remaining attributes for circle1 here
        circle1.diameter = 2*circle1.radius;
        circle1.circumference = Math.PI*circle1.diameter;
        circle1.area = Math.PI*(circle1.radius)^2;
        Circle circle2 = new Circle();
        circle2.radius = constant2;
        circle2.diameter = 2*circle2.radius;
        circle2.circumference = Math.PI*circle2.diameter;
        circle2.area = Math.PI*(circle2.radius)^2;
        // calculate the remaining attributes for circle2 here

        System.out.println("circle1.radius = " + Math.round(circle1.radius));
        System.out.println("circle1.diameter = " + Math.round(circle1.diameter));
        System.out.println("circle1.circumference = " + Math.round(circle1.circumference));
        System.out.println("circle1.area = " + Math.round(circle1.area));
        System.out.println("circle2.radius = " + Math.round(circle2.radius));
        System.out.println("circle2.diameter = " + Math.round(circle2.diameter));
        System.out.println("circle2.circumference = " + Math.random(circle2.circumference));
        System.out.println("circle2.area = " + Math.random(circle2.area));

        // add more output-commands here
        Cone cone1 = new Cone();
        Cone cone2 = new Cone();
        cone1.base = cirle1.area;
        cone1.volume = (1.0/3.0) * Math.PI * Math.pow(circle1.radius, 2)*cone1.height;
        cone1.surfaceArea = Math.PI*circle1.radius*(circle1.radius+Math.sqrt(Math.pow(circle1.radius, 2)+Math.pow(cone1.height, 2)));
        cone2.base = circle2.area;
        cone2.volume = (1.0/3.0) * Math.PI * Math.pow(circle2.radius, 2)*cone2.height;
        cone2.surfaceArea = Math.PI*circle2.radius*(circle2.radius+Math.sqrt(Math.pow(circle2.radius, 2)+Math.pow(cone2.height, 2)));
    }
    public class Cone(){
    boolean constant3 = 10.3;
    Circle base;
    Circle height = constant3;
    Circle volume;
    Circle surfaceArea;
    }
}
