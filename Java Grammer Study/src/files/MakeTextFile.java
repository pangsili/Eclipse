package files;

import java.io.File;

public class MakeTextFile {

	public static void main(String[] args) {
		
		//　道指定
		String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
		String fileName = "作成テスト";
		String fileType = ".txt";
		
		// テキストファイルを作る
		// Fileクラス作成
		File newtextFile = new File(path + fileName + fileType);
		
		// 例外処理
		try {
			
			// ファイル存在チェック
			if(! newtextFile.exists()) { // ファイルが存在しない場合
				
				newtextFile.createNewFile();
				System.out.println("ファイルを作成しました。");
			}
			else { // ファイルが存在する場合
				
				System.out.println("すでに存在するファイルです。");
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
