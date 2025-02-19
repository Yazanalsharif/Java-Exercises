package FilesExcersize;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UseBuffer {
	public static void main(String args[]) throws IOException{
		FileOutputStream copy = null;
		FileInputStream original = null;
		
		try {
			
		original = new FileInputStream("E:\\filesFromJava\\javaBooks.pdf");
		System.out.println("test1");
		copy = new FileOutputStream("E:\\filesFromJava\\javaBook(copy).pdf");
		byte copyBuffer [] = new byte[4000];
		int c;
		
		while((c = original.read(copyBuffer)) != -1) {
			copy.write(copyBuffer);
		}
	
		
		
		}catch(Exception e) {//try use Exception
			System.out.println(e.getMessage());
		}finally {
			if(original != null) {
				original = null;
			}
			if(copy != null) {
				copy = null;
			}
			
		}
		
		
	}

}
