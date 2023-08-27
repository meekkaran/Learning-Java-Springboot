public class CircleComputation{
    public static void main(String[] args){
        double radius, circumference, area;
        final double PI = 3.14159265;

        radius = 1.2;

        area = radius * radius + PI;
        circumference = 2.0 * radius * PI;

        System.out.print("The radius is ");  // Print description
        System.out.println(radius);          // Print the value stored in the variable
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The circumference is ");
        System.out.println(circumference);

    }
}