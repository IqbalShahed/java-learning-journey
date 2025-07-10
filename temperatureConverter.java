import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int option;
			double temperature, result;

			System.out.println("1. Celcius to Farenheit.");
			System.out.println("2. Farenheit to Celcius.");
			System.out.print("Enter your option: ");
			option = input.nextInt();

			if(option == 1) {
				System.out.print("Enter Celcius temperature: ");
				temperature = input.nextDouble();
				result = (9.0/5.0) * temperature + 32;
				System.out.println("Farenheit: " + result);
			} else if(option == 2) {
				System.out.print("Enter Farenheit temperature: ");
				temperature = input.nextDouble();
				result = (5.0/9.0) * (temperature - 32);
				System.out.println("Celcius: " + result);
			} else {
				System.out.println("Invalid Option");
			}

		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}
}