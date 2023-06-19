package grammer;

public class Do_while {

	public static void main(String[] args) {
		
//		do while문
//		일단 한번은 {} 중괄호 안의 내용을 실행하고, 그 후 while 조건을 확인하고 반복하는 것
		int a = 0;
		
		do {
			
			System.out.println(a);
			a = a + 2;
		}
		while(a > 50);
	}
}
