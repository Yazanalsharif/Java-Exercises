package FilesExcersize;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FileReaderAndFileWriter {
	public static void main(String args[]) throws Exception {
		PrintWriter copy = null; 
		BufferedReader original = null;
		//note the new file greater than the old with too mush
		
		try {
			copy = new PrintWriter(new FileWriter("E:\\filesFromJava\\new(copy2).txt"));
			original = new BufferedReader(new FileReader("E:\\filesFromJava\\new.txt"));
			String i;
			while((i = original.readLine()) != null) {
				copy.println(i);
			}
			System.out.println("done");
			
		}catch(Exception e) {
			System.err.println("error");
			
		}finally {
			if(original != null)
				original.close();
			if(copy != null) 
				copy.close();
		}
		
	}
 
}
