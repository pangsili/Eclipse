package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {

		// 텍스트 파일을 읽어들이기 위해서는 FileReader와 BufferedReader가 필요합니다.
		// FileReader 클래스는 파일에 저장된 바이트를 유니코드 문자로 변환해서 읽어들이는 역할을 담당하고,
		// BufferedReader는 FileReader로 읽어들인 내용을 버퍼링 하여 문자, 문자 배열, 문자열 라인 등을 보다 효율적으로 처리하도록 돕는 역할을 합니다.
		FileReader fReader = null;
		BufferedReader bReader = null;
		
		try {
			String path = "C:\\Users\\Style2206010\\Desktop\\フォルダ作り\\";
			String fileName = "作成テスト";
			String fileType = ".txt";
			String s;
			
			File file = new File(path + fileName + fileType);
			fReader = new FileReader(file);
			bReader = new BufferedReader(fReader);
			s = bReader.readLine();

			// 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
			while(s != null) {
				
				System.out.println(s);
				s = bReader.readLine();
			}
			
			bReader.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}
