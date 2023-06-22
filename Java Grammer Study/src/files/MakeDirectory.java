package files;

import java.io.File;

public class MakeDirectory {

	public static void main(String[] args) {
		
		// フォルダを作る。
		// pathとフォルダ名で道を作る。
		String path = "C:\\Users\\Style2206010\\Desktop\\"; // デスクトップ
		String フォルダ名 = "フォルダ作り"; // フォルダ名
		
		// Fileオブジェクト宣言
		File newFolder = new File(path + フォルダ名);
		
		// 例外処理
		try {
			
			if(! newFolder.exists()) { // フォルダが存在しない場合フォルダを作る。
				
				if(newFolder.mkdir()) { // フォルダ作りが成功する場合
					
					System.out.println("フォルダが作られました。");
				}
				else { // フォルダ作りが失敗する場合
					
					System.out.println("フォルダが作られませんでした。");
				}
			}
			else {  // フォルダが存在する場合フォルダを作らない。
				
				System.out.println("すでに存在するフォルダです。");
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
