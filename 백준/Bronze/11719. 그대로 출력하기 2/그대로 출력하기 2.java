

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> inputList = new ArrayList<>();
		while(true) {
			
			String input = sc.nextLine();
			System.out.println(input);
			
			inputList.add(input);
			
			if(! sc.hasNextLine()) {
				
				break;
			}
		}
	}
}
