package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteinFile {

	public static void main(String[] args) {
		
//		// 1. FileWriter
//		String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
//		String fileName = "作成テスト";
//		String fileType = ".txt";
//		
//		String message = "This is a sample message.\n";
//		
//		File file = new File(path + fileName + fileType);
//		FileWriter fw = null;
//		
//		try {
//			if(file.exists()) {
//				
//				// 기존 내용에 이어서 쓰려면 true, 기존 내용을 없애고 새로 쓰려면 false
//				fw = new FileWriter(file, true);
//				fw.write(message);
//				fw.flush();
//				System.out.println("メッセージを作成しました。");
//				
//				fw.close();
//			}
//			else {
//				
//				System.out.println("存在しないファイルです。");
//			}
//		}
//		catch(Exception e) {
//			
//			e.printStackTrace();
//		}
		
//		// 2. FileWriter and BufferedWriter
//		String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
//		String fileName = "作成テスト";
//		String fileType = ".txt";
//		
//		String message = "This is a buffer sample message.\n";
//		
//		File file = new File(path + fileName + fileType);
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		
//		try {
//			
//			if(file.exists()) {
//				
//				fw = new FileWriter(file, true);
//				bw = new BufferedWriter(fw);
//				
//				bw.write(message);
//				bw.flush();
//				System.out.println("bwでメッセージを作成しました。");
//				
//				bw.close();
//			}
//			else {
//				
//				System.out.println("存在しないファイルです。");
//			}
//		}
//		catch(Exception e) {
//			
//			e.printStackTrace();
//		}
		
		// おすすめ
		// 3. FileOutputStream
		// FileOutputStream 은 OutputStream 을 상속한 클래스로서, 파일로 바이트 단위의 출력을 내보내는 클래스이다.
		// 1, 2 와의 차이점은 출력하고자 하는 대상을 먼저 바이트 배열로 바꿔줘야 한다는 것이다.
		// 왜냐하면, 앞서 언급된 상위 클래스인 OutputStream 은 바이트 단위의 출력을 다루기 때문이다.
		// 이 과정을 통해서 출력 대상 데이터가 일련의 이진 데이터 (binary data) 로 변환됩니다.
		String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
		String fileName = "作成テスト";
		String fileType = ".txt";
		
		String message = "This is a FileOutputStream sample message.\n";
		
		File file = new File(path + fileName + fileType);
		FileOutputStream fos = null;
		
		try {
			
			if(file.exists()) {
				
				// FileOutputStream 클래스가 파일에 바이트를 내보내는 역할을 하는 클래스이므로
				// 내보낼 내용을 바이트로 변환을 하는 작업이 필요하다.
				byte[] content = message.getBytes();
				
				fos = new FileOutputStream(file);
				
				fos.write(content);
				fos.flush();
				System.out.println("ファイルをFOSで作成しました。");
				
				fos.close();
			}
			else {
				
				System.out.println("存在しないファイルです。");
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
