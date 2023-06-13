package check;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 相関チェック {
	
	public static void main(String[] args) {
		
		System.out.println("相関チェック START");
		
		String 苗字		= "金";
		String 下の名前 	= "ジフン";
		Integer 歳 		= 30;
		String 誕生日 	= "2023/06/11";
		String メール 		= "jhkim@stylesystem.co.jp";

		int 結果 = dateCheck(誕生日);
		System.out.println(結果);
		
		System.out.println("相関チェック END");
	}

	private static int dateCheck(String 日付) {
		
		Date 今日 = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		String 今日str = sdf1.format(今日);
		
		return dateCheck(日付, 今日str);
	}
	
	private static int dateCheck(String 日付, String 比較日付) {
		
		if(日付.compareTo(比較日付) > 0) { // 日付 > 今日　= 3
			
			return 3;
		}
		else if(日付.compareTo(比較日付) == 0) { // 日付 = 今日　= 2
			
			return 2;
		}
		else { // 日付 < 今日　= 1
			
			return 1;
		}	
	}
}






