package string;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input = "Java Code ";
		System.out.println("Original String ::" + input);//Java Code

		String output = "";

		String words[] = input.split(" ");

		for (String word : words) {
			String revWord = " ";

			// reverse word
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}

			output = output + revWord + " ";
		}
		System.out.println("Reverse String ::" + output);//avaJ  edoC 

	}

}


/*Original String ::Java Code 
Reverse String :: avaJ  edoC */