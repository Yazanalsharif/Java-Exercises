package FilesExcersize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.File;

public class ChangeFile {
	public static void main(String args[]) {
		BufferedInputStream bdfBu = null;
		BufferedOutputStream wordBu = null;
		FileInputStream bdf = null;
		FileOutputStream word = null;
		File chapter3 = new File("E://chapter3.pdf");
		File yazan = new File("E://yazan.docx");
		
		try {
			bdf = new FileInputStream(chapter3);
			word = new FileOutputStream(yazan);
			bdfBu = new BufferedInputStream(bdf);
			wordBu = new BufferedOutputStream(word);
			
			int c;
			while((c = bdfBu.read()) != -1) {
				wordBu.write(c);
			}
			System.out.println("its not work");
			
		}catch(Exception e) {
			
		}finally {
			if(bdfBu != null)
				bdf = null;
			if(wordBu != null)
				word = null;
		}
		
		
	}

}
