package check;

public class 形チェック {

	public static void main(String[] args) {
		
		System.out.println("形チェック START");
		
		String 入力値 = "test1";
		//
		String アルファベット = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
//		char[] 入力一文字配列 = 入力値.toCharArray();
		String[] 入力一文字配列 = 入力値.split("");
		boolean 結果 = true;
		
		for(String 入力一文字 : 入力一文字配列) {
			
			if(! アルファベット.contains(入力一文字)) {
				
				結果 = false;
				break;
			}
		}
		System.out.println(結果);
		
		System.out.println("形チェック END");
	}
}
