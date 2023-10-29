

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] gradeArray1 = new int[5][2];
		
		// 총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다.
		for(int i = 0; i < 5; i++) {
			
			String grade = sc.nextLine();
			String[] gradeArray = grade.split(" ");
			
			// 입력값의 합을 각각 구한다.
			int grade1 = Integer.parseInt(gradeArray[0]);
			int grade2 = Integer.parseInt(gradeArray[1]);
			int grade3 = Integer.parseInt(gradeArray[2]);
			int grade4 = Integer.parseInt(gradeArray[3]);
			
			int gradeSum = grade1 + grade2 + grade3 + grade4;

			gradeArray1[i][0] = i + 1;
			gradeArray1[i][1] = gradeSum;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 5; i++) {
			
			max = max < gradeArray1[i][1] ? gradeArray1[i][1] : max;
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(gradeArray1[i][1] == max) {
				
				System.out.println(gradeArray1[i][0] + " " + max);
				break;
			}
		}
	}
}
