package files;

import java.io.File;

public class DeleteTextFile {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
		String fileName = "作成テスト";
		String fileType = ".txt";
		
		// テキストファイルを作る
		// Fileクラス削除
		File deleteTextFile = new File(path + fileName + fileType);
		
		// 例外処理
		try {
			
			// ファイル存在チェック
			if(deleteTextFile.exists()) { // ファイルが存在する場合
				
				deleteTextFile.delete();
				System.out.println("ファイルを削除しました。");
			}
			else { // ファイルが存在しない場合
				
				System.out.println("存在しないファイルです。");
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
