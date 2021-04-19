package ver2_lec05.fileIO05.training01;

import java.io.File;
import java.util.Date;

public class FileManyFunction01 {

	public static void main(String[] args) throws Exception {
		
		
		  File txtFile = new File("C:\\java\\eclipse\\inflearn\\FileIOTextFile.txt");
		  File txtFolder = new File("C:\\java\\eclipse\\inflearn\\FileIOFolder");
		  
		  
		  String fileName = txtFile.getName(); System.out.println("fileName : " +
		  fileName);
		  
		  long longLastModified = txtFile.lastModified();
		  System.out.println("longLastModified : " + longLastModified); Date
		  dateLastModified = new Date(longLastModified);
		  System.out.println("dateLastModified : " + dateLastModified);
		  
		  String filePath = txtFile.getPath(); System.out.println("filePath : " +
		  filePath); String fileAbosolutPath = txtFile.getAbsolutePath();
		  System.out.println("fileAbsolutePath : " + fileAbosolutPath); String
		  fileCannoicalPath = txtFile.getCanonicalPath();
		  System.out.println("fileCanonicalPath : " + fileCannoicalPath);
		  
		  boolean txtFileExists = txtFile.exists();
		  System.out.println("txtFileExistst : " + txtFileExists);
		  
		  boolean txtFileFile = txtFile.isFile(); System.out.println("txtFileFile : " +
		  txtFileFile); boolean txtFolderFile = txtFolder.isFile();
		  System.out.println("txtFolderFile : " + txtFolderFile);
		  
		  boolean txtFileDirectory = txtFile.isDirectory();
		  System.out.println("txtFileDirectory : " + txtFileDirectory); boolean
		  txtDirectory = txtFolder.isDirectory(); System.out.println("txtDirectory : "
		  + txtDirectory);
		  
		  String[] txtFileList = txtFile.list(); System.out.println("txtFileList : " +
		  txtFileList); String[] txtFolderList = txtFolder.list();
		  
		  
		  for(int i=0;i<txtFolderList.length;i++) {
		  System.out.println(txtFolderList[i]); }
		  
		  
		  boolean mkdir = txtFolder.mkdir(); System.out.println("mkdir : " + mkdir);
		  boolean mkdirs = txtFolder.mkdirs(); System.out.println("mkdirs : " +
		  mkdirs);
		  
		  File createFolder = new
		  File("C:\\java\\eclipse\\inflearn\\FileIOFolder\\newFolder"); boolean
		  createmkdir = createFolder.mkdirs(); System.out.println("createmkdirs : " +
		  createmkdir);
		  
		  
		  
		  File txtNewFileCreate = new
		  File("C:\\java\\eclipse\\inflearn\\createNewFile.txt"); boolean txtFileMkdir
		  = txtNewFileCreate.createNewFile(); System.out.println("txtFileMkdir : " +
		  txtFileMkdir);
		  
		  File txtNewFileCreate1234 = new
		  File("C:\\java\\eclipse\\inflearn\\createNewFile1234.txt"); boolean
		  tfRenameTo = txtNewFileCreate.renameTo(txtNewFileCreate1234);
		  System.out.println("tfRenameTo : " + tfRenameTo);
		 
		 

		File deleteFolder = new File("C:\\java\\eclipse\\inflearn\\deleteFolder");
		boolean tfDelete = deleteFolder.delete();
		System.out.println("deleteFolder : " + tfDelete);

		long freeSpace = txtNewFileCreate.getFreeSpace();
		System.out.println(" freeSpace : " + freeSpace);
		long freeSpaceGB = ((freeSpace/1024)/1024)/1024;
		System.out.println(" freeSpaceGB : " + freeSpaceGB);
		
		long totalSpace = txtFile.getTotalSpace();
		System.out.println("totalSpace : " + totalSpace);
		long totalSpaceGB = ((totalSpace/1024)/1024)/1024;
		System.out.println("totalSpaceGB : " + totalSpaceGB);
		
	}

}
