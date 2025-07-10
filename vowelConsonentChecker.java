import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        System.out.print("Enter any character: ");
        c = input.next().charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Vowel");
        } else{
            System.out.println("Consonent");
        }
        input.close();
	}
}