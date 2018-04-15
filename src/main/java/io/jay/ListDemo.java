package io.jay;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List ls = new ArrayList();
		ls.add("one");
		ls.add("two");
		ls.add("three");
		ls.add("four");
		
		System.out.println(ls);
		
	
		File f = new File("E:\\C-302\\pass");
		File[] listOfFiles = f.listFiles();
		List passFileList = new ArrayList();
		for(File fileObj: listOfFiles){
			passFileList.add(fileObj.getName());
		}
		
		
		//Arrays.asList(listOfFiles);
		
		System.out.println(passFileList);
		
		System.out.println(ls.containsAll(passFileList));
		
		for(Object lsObj: ls){
			for(Object passFileListObj: passFileList)
			if(lsObj.equals(passFileListObj)){
				System.out.println(lsObj);
			}
		}
		
	}

}
