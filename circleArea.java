import java.util.Scanner;

class Main {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            double radious;
            System.out.print("Enter the radious of circle: ");
            radious = input.nextDouble();
            double area = 3.1416 * radious;
            System.out.println("Area of circle is: " + area);
            input.close();
        } catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}