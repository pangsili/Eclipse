import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 기초배열만들기
		String[][][] board = new String[2][10][10];
				
		// 덮어쓰는 줄
		for(int i = 0; i < board[1].length; i++) {
					
			for(int j = 0; j < board[1][i].length; j++) {
						
				board[1][i][j] = "〇";
			}
		}
				
		// 지뢰줄의 안전지대
		for(int i = 0; i < board[0].length; i++) {
					
			for(int j = 0; j < board[0][i].length; j++) {
						
				board[0][i][j] = "   ";
						
				// 주위의 지뢰 갯수를 표시하는 것으로 바꾸기
			}
		}
				
		// 지뢰줄의 지뢰지대
		for(int i = 0; i < 10; i++) {
					
			while(true) {
						
				int RandomI = (int)(Math.random() * 10);
				int RandonJ = (int)(Math.random() * 10);
				
				if(! "×".equals(board[0][RandomI][RandonJ])) {
							
					board[0][RandomI][RandonJ] = "×";
					break;
				}
			}	
		}
				
		// 덮는 줄 1차 출력
		for(int i = 0; i < board[1].length; i++) {
					
			for(int j = 0; j < board[1][i].length; j++) {
						
				System.out.print(board[1][i][j]);
			}
			System.out.println();
		}
				
		// 몇번이고 선택할 수 있게한다.
		while(true) {
					
			// 선택할 곳 선정
			Scanner sc = new Scanner(System.in);
					
			int InputI = sc.nextInt();
			int InputJ = sc.nextInt();
					
			board[1][InputI][InputJ] = board[0][InputI][InputJ];
					
			// 선택 칸에 숫자 매기기 (주변에 있는 지뢰의 수)
			int a = 0;
					
			if(! "×".equals(board[0][InputI][InputJ])) {
						
				for(int i = (InputI - 1); i <= (InputI + 1); i++) {
							
					for(int j = (InputJ - 1); j <= (InputI + 1); j++) {
								
						if(i < 0 || i > 9 || j < 0 || j > 9) {
									
							continue;
						}
						if("×".equals(board[0][i][j])) {
									
							a = a + 1;
							board[1][InputI][InputJ] = a + "";
						}
					}
				}
			}
					
			// 선택한 후 새로 출력
			for(int i = 0; i < board[1].length; i++) {
						
				for(int j = 0; j < board[1][i].length; j++) {
							
					System.out.print(board[1][i][j]);
				}
				
				System.out.println();
			}
					
			// 지뢰 선택시 실패 문구 출력하며 끝냄
			if("×".equals(board[1][InputI][InputJ])) {
						
				System.out.println("Fail");
				break;
			}
		}	
	}
}

