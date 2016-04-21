package edu.bbte.desktop_app.classes;

import edu.bbte.desktop_app.interfaces.FileExtMan;

public class ManFactory {
	private FileExtMan fileExtMan;
	private static ManFactory INSTANCE;
	
	public static ManFactory getInstance(){
		if(INSTANCE==null){
			INSTANCE = new ManFactory();
		}
		return INSTANCE;
	}
	
	public FileExtMan getFileExtMan()
	{
		if (fileExtMan==null)
		{
			fileExtMan = new FakeFileExtMan(true);
		}
		return fileExtMan;
	}
	
	public void setFileExtMan(FileExtMan fileExtMan){
		this.fileExtMan = fileExtMan;
	}
}
