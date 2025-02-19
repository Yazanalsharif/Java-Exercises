package FilesExcersize;

import java.io.File;
import java.util.Date;

public class Files {
	public static void main(String args[]) {
		File win = new File("C:\\Windows\\Temp");
		System.out.println(win.getPath());
		System.out.println(win.isDirectory());
		
		if(win.exists()) {
			long lastEdit = win.lastModified();
			Date edit = new Date(lastEdit);
			System.out.println(lastEdit);
			System.out.println(edit);
			
		}
		if(win.isDirectory()) {
			String list[] = win.list();
			File listFile[] = win.listFiles();
			for(int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
			for(int i = 0; i < listFile.length; i++) {
				System.out.println(listFile[i].getPath());
			}
		}
	}

}
