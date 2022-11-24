package fileHandling;

import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileDemo fd = new FileDemo();
		fd.fileMethod();
	}

}

class FileDemo{
	protected void fileMethod(){
		File fl = new File("/Java/FILECONCEPT");
		System.out.println("File Name - "+fl.getName());
		System.out.println("Path - "+fl.getPath());
		System.out.println("Absolute Path - "+fl.getAbsolutePath());
		System.out.println("Is Absolute Path - "+fl.isAbsolute());
		System.out.println("Parent - "+fl.getParent());
		
		System.out.println("Is a file - "+fl.isFile());
		System.out.println("Last Modified - "+fl.lastModified());
		System.out.println("File size - "+fl.length());
		
		File fl1 = new File("/Java");
		String[] fileLit = fl1.list();
		System.out.println("List of file in Dir as below");
		for (String str : fileLit) {
			System.out.println(">> "+str);
		}
	}
}
