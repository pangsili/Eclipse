

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> leftList = new ArrayList<>();
		List<Integer> rightList = new ArrayList<>();

		// 세 점이 주어진다.
		for(int i = 0; i < 3; i++) {
			
			String input = sc.nextLine();
			
			// 왼쪽전용 배열, 오른쪽 전용 배열로 나누어서 입력한다.
			String[] inputArray = input.split(" ");
			
			leftList.add(Integer.parseInt(inputArray[0]));
			rightList.add(Integer.parseInt(inputArray[1]));
		}
		
		// 각 배열 정렬하고 index0, 2번째 수를 더한 값이 1, 3번째를 더한 값이랑 같아야 하므로, 이걸로 계산한다.
		Collections.sort(leftList);
		Collections.sort(rightList);
		
		int left = (leftList.get(0) + leftList.get(2)) - leftList.get(1);
		int right =  (rightList.get(0) + rightList.get(2)) - rightList.get(1);
		
		System.out.println(left + " " + right);
	}
}
