package grammer;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		// switch문 공부
		// 조건문이고, if문과는 달리 가독성이 좋고 이후 열편집 프로그램 등을 사용하는 경우에 유용하다.
		
		Scanner sc = new Scanner(System.in); // 입력받기 위해 스캐너 생성
		
		System.out.println("Enter Number : ");
		
		int nNum = sc.nextInt(); 	// 엔터가 입력될때까지 입력 받는다
									// 문자열을 입력받을때는 String strC = sc.nextLine();
		switch(nNum) {
		
			case 1 : { // 입력한 숫자가 1일때 실행
				
				System.out.println("1을 입력하였습니다.");
				break;
			}
			case 2 : { // 입력한 숫자가 2일때 실행
				
				System.out.println("2을 입력하였습니다.");
				break;
			}
			case 3 : { // 입력한 숫자가 3일때 실행
				
				System.out.println("3을 입력하였습니다.");
				break;
			}
			case 4 : { // 입력한 숫자가 4일때 실행
	
				System.out.println("4을 입력하였습니다.");
				break;
			}
			default : { // 위에서 지정한 case 외의 값이 들어올 때 실행
				
				System.out.println("1, 2, 3, 4 가 아닌 숫자입니다.");
				break;
			}
		}	
	}
}
