package Chapter12;

import java.io.*;

public class filetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fobj= new File("samplefile.txt");
	//	File directory= new File("C:\\Users\\hp\\Documents\\22311\\MyProject\\src\\Chapter2");
		System.out.println(fobj.getName());
		System.out.println(fobj.getAbsolutePath());
		System.out.println(fobj.getPath());
		System.out.println(fobj.isFile()?"It is a file":"It is a pipe");
	//	System.out.println(directory.isDirectory()?"It is a directory.":"It is a pipe");
		
	}
}
