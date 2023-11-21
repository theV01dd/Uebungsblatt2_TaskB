public class RoundAndRound {
    public static void main(String[] args) {
ü        Circle circle1 = new Circle();
        circle1.radius = 5.1;
        // calculate the remaining attributes for circle1 here
        circle1.diameter = 2*circle1.radius;
        circle1.circumference = Math.PI*circle1.diameter;
        circle1.area = Math.PI*(circle1.radius)^2;
        Circle circle2 = new Circle();
        circle2.radius = 17.5;
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
    }
}
