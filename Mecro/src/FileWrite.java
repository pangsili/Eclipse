import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWrite {
	
	private static final String FILES_PATH = "C:\\\\Users\\\\Style2009008\\\\Desktop\\\\20230612 まとめ\\\\02. テストデータ\\\\SPO\\\\SPOSTGPMOManagement - モダン（グループ外）\\\\本番用";
	
	public static void main(String[] args) throws Exception {

		String fileName = "result.csv";
		File inputFile = new File(FILES_PATH + "\\" + fileName);
		
		File outFolder = new File(FILES_PATH + "\\outFile");
		if (!outFolder.isDirectory()) {
			
			outFolder.mkdirs();
		}
		
		StringBuffer sb = new StringBuffer();
		
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		
		boolean fileStart = false;
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		List<File> fileList = new ArrayList<>();
		while(br.ready()) {

			String line = br.readLine();
			String temp = line.replaceAll("\t", "");
			if (fileStart && "".equals(temp) || temp == null) {
				
				bw.append(sb.toString());
				bw.flush();
				fw.flush();
				bw.close();
				fw.close();
				fileList.add(file);
				fileStart = false;
				continue;
			}
			if (!fileStart && line.contains(".csv")) {
				
				line = line.replaceAll("\t", "");
				file = new File(FILES_PATH + "\\outFile\\" + line);
				file.createNewFile();
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				sb = new StringBuffer();
				fileStart = true;
				continue;
			}
			
			if (fileStart) {
				
				sb.append("\"");
				line = line.replaceAll("\t", "\",\"");
				sb.append(line);
				sb.append("\"");
				sb.append("\r\n");
			}
		}

		br.close();
		fr.close();
	}
}
