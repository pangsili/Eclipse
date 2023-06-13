package check;

public class 長さチェック {
	
	public static void main(String[] args) {
		
		System.out.println("長さチェック START");
		
		String 苗字		= "金";
		String 下の名前 	= "ジフン";
		Integer 歳 		= 30;
		String 誕生日 	= "20230619";
		String メール 		= "jhkim@stylesystem.co.jp";
		
		if(isLengthCheck(苗字, 10)) {
			
			
		}

		System.out.println("長さチェック END");
	}

	private static boolean isLengthCheck(Object 値, Integer マックス長さ) {
		
		if(値 instanceof String) {
			
			if(((String)値).length() > マックス長さ) {
				
				return true;
			}
		}
		else if(値 instanceof Integer) {
			
			if((((Integer)値) + "").length() > マックス長さ) {
				
				return true;
			}
		}
		
		return false;
	}
}
