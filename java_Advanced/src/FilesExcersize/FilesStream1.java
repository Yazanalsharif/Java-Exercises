package FilesExcersize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;


public class FilesStream1 {
	public static void main(String args[]) {
		try {
			char Numbers[] = "yazan al sharif\nage:20years\nsoftware engineering".toCharArray();
			FileOutputStream out = new FileOutputStream("E:\\filesFromJava\\yazan.txt");
			for(int i = 0; i < Numbers.length; i++) {
				out.write((int)Numbers[i]);
			}
			out.close();
			
			FileInputStream inpu = new FileInputStream("C:\\hello.txt");
			int size = inpu.available();
			for(int i = 0; i < size; i++) {
				System.out.print((char)inpu.read());
			}
			inpu.close();
					
		}catch(IOException e) {
			System.out.println("Exception");
			
		}
	}
 
}
