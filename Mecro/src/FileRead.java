import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileRead {
	
	private static final String FILES_PATH = "C:\\Users\\Style2009008\\Desktop\\20230612 まとめ\\02. テストデータ\\SPO\\SPOSTGPMOManagement - モダン（グループ外）\\本番用";
	
	public static void main(String[] args) throws Exception {

		File inputFile = new File(FILES_PATH);
		File[] inputFiles = inputFile.listFiles();
		
		StringBuffer sb = new StringBuffer();
		for (File _file : inputFiles) {
			
			FileReader fr = new FileReader(_file);
			BufferedReader br = new BufferedReader(fr);
			
			String fileName = _file.getName();
			sb.append(fileName);
			sb.append("\r\n");
			while(br.ready()) {
				
				String line = br.readLine();
				line = line.replaceAll(",", "\t");
				sb.append(line);
				sb.append("\r\n");
			}
			sb.append("\r\n");
			
			br.close();
			fr.close();
		}
		
		sb.append("\r\n");
		sb.append("END");
		
		String fileName = "result.csv";
		File outputFile = new File(FILES_PATH + "\\" + fileName);
		FileWriter fw = new FileWriter(outputFile);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(sb.toString());
		bw.flush();
		fw.flush();
		
		bw.close();
		fw.close();
	}
}
