import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        if(age >= 18){
            System.out.println("Valid Voter.");
        } else{
            System.out.println("Invalid Voter.");
        }
        input.close();
	}
}