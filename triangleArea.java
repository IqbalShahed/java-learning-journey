import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			float base, height;
			System.out.println("Enter the base of triangle");
			base = input.nextFloat();
			System.out.println("Enter the height of triangle");
			height = input.nextFloat();
			float area = 0.5f * base * height;
			System.out.println("Area of triangle is: " + area);
			input.close();
		} catch(Exception e) {
			System.out.println("Error" + e);
		}
	}
}