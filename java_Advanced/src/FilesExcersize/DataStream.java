package FilesExcersize;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {
	public static void main(String args[]) throws Exception {
		DataOutputStream newFile = null;
		DataInputStream oldFile = null;
		
		int price[] = {20, 30, 40, 50, 23, 12, 15, 17};
		String enjoy[] = {"programming", "coffe", "Games", "girls", "girls", "girls", "girls", "girls"};
		try {
	     newFile = new DataOutputStream(new FileOutputStream("E:\\filesFromJava\\newFile.txt"));
	     for(int i = 0; i < price.length; i++) {
	    	 newFile.writeInt(price[i]);
	    	 newFile.writeUTF(enjoy[i]);
	     }
	     oldFile = new DataInputStream(new FileInputStream("E:\\filesFromJava\\newFile.txt"));
	     int price2[] = new int[8];
	     String enjoy2[] = new String[8];
	     for(int i = 0; i < price2.length; i++) {
	    	 price2[i] = oldFile.readInt();
	    	 enjoy2[i] = oldFile.readUTF();
	    	 System.out.println(price2[i]);
	    	 System.out.println(enjoy2[i]);
	     }
		
		}catch(Exception e) {
			
		}finally {
			if(newFile != null)
				newFile.close();
			if(oldFile != null)
				oldFile = null;
			
		}
		
	}

}
