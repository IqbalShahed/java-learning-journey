import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive integer: ");
        num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Positive Number");
        } else {
            System.out.println("Negetive Number");
        }
        input.close();
	}
}