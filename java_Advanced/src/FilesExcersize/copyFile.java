package FilesExcersize;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class copyFile {
	public static void main(String args[]) throws IOException {
		FileInputStream original = null;//the file i want copy it
		FileOutputStream copy = null; //the copy
		File originalFile = new File("E:\\filesFromJava\\yazan.txt");
		File CopedFile = new File("E:\\filesFromJava\\yazan(copy).txt");
		try {
			original = new FileInputStream(originalFile);
			copy = new FileOutputStream(CopedFile);
			int size;
			while((size = original.read()) != -1) {
				copy.write(size);
			System.out.print(size);
			}
		}catch(IOException e) {
			System.out.println("Exception");
		}finally {
			if(original != null)
				original.close();
			if(copy != null)
				copy.close();
		}
	}

}
