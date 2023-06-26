package files;

import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {
	
		// フォルダを作る。
		// pathとフォルダ名で道を作る。
		String path = "C:\\Users\\Style2206010\\Desktop\\"; // デスクトップ
		String フォルダ名 = "フォルダ作り"; // フォルダ名
		
		// Fileオブジェクト宣言
		File folderName = new File(path + フォルダ名);
		
		// 例外処理
		try {
			
			if(folderName.exists()) { // フォルダが存在する場合フォルダを作る。
				
				if(folderName.delete()) { // 削除成功した場合
					
					System.out.println("フォルダを削除しました。");
				}
				else { // 削除失敗した場合
					
					System.out.println("フォルダ削除に失敗しました。");
				}
			}
			else {  // フォルダが存在しない場合フォルダを作らない。
						
				System.out.println("存在しないフォルダです。");
			}
		}
		catch(Exception e) {
					
			e.printStackTrace();
		}
	}
}
