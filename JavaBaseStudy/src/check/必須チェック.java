package check;

public class 必須チェック {
	
	public static void main(String[] args) {
		
		System.out.println("必須チェック START");
		
		String 苗字		= "金";
		String 下の名前 	= "ジフン";
		Integer 歳 		= 30;
		String 誕生日 	= "20230619";
		String メール 		= "jhkim@stylesystem.co.jp";
		
		if(isNullCheck(苗字)) {
			
			
		}

		System.out.println("必須チェック END");
	}

	private static boolean isNullCheck(Object 値) {
		
		if(値 instanceof String) {
			
			if("".equals(値) || 値 == null) {
				
				return true;
			}
		}
		else {
			
			if(値 == null) {
					
			}
		}
		
		return false;
	}
}
