class Main {
	public static void main(String[] args) {
		// Prefix increment and decrement
		int x = 20;
		int y = 21;
		System.out.println("Prefix increment: " + ++x); // print x = 21 (pre increment)
		System.out.println("Prefix decrement: " + --y); // print y = 20 (pre increment)

		// Post increment and decrement
		int a = 20;
		int b = 21;
		System.out.println("Post increment: " + a++); // print x = 20 (post increment)
		System.out.println("Post increment: " + a); // Now print x = 21

		System.out.println("Post decrement: " + b--); // print x = 21 (post decrement)
		System.out.println("Post decrement: " + b); // Now print x = 20
	}
}