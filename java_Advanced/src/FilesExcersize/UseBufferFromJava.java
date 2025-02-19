package FilesExcersize;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class UseBufferFromJava {
	public static void main(String args[]) {
		FileOutputStream copy = null;
		FileInputStream orig = null;
		BufferedInputStream bufInput = null;
		BufferedOutputStream bufOutput = null;
		
		
		try {
			orig = new FileInputStream("E:\\chapter3.pdf");
			copy = new FileOutputStream("E:\\chapter3copy.pdf");
			
			 bufInput = new BufferedInputStream(orig);
			
			 bufOutput = new BufferedOutputStream(copy);
			
			int c;
			while((c = bufInput.read()) != -1) {
				bufOutput.write(c);
			}
			System.out.println("sucsses");
			
			
		}catch(Exception e) {
			
		}finally {
			if(bufInput != null) {
				orig = null;
			}
			if(bufOutput != null) {
				copy = null;
			}
		}
		
	}

}
