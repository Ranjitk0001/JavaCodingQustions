package string;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		// "\"Pr!ogr#am%m*in&g Lan?#guag(e\"";
//		"$ja!va$&st%ar";
		String str="$ja!va$&st%ar";
		String plaintext=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plaintext);//javastar

	}

}
