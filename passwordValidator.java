public class Main
{
	public static boolean isValidPassword(String password) {
		if(password.length() < 8) {
			return false;
		}
		boolean hasSpecialChar = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;

		for(int i = 0; i < password.length(); i++) {
			if(hasUpperCase == false && password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				hasUpperCase = true;
			} else if(hasLowerCase == false && password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				hasLowerCase = true;
			} else if(hasNumber == false && password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				hasNumber = true;
			} else if(hasSpecialChar == false && (password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$')) {
				hasSpecialChar = true;
			}
		}
		return hasSpecialChar && hasUpperCase && hasLowerCase && hasNumber;
	}

	public static void main(String[] args) {
		System.out.println("Password 'Pass@123': " + isValidPassword("Pass@123")); // true
		System.out.println("Password 'password': " + isValidPassword("password")); // false
		System.out.println("Password 'Short@1': " + isValidPassword("HelloWorld")); // false
		System.out.println("Password 'NoSpecialChar1A': " + isValidPassword("NoSpecialChar1A")); // false
		System.out.println("Password 'Valid$Password1': " + isValidPassword("Valid$Password1")); // true
	}
}