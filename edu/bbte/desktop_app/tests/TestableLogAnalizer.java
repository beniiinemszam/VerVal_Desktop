package edu.bbte.desktop_app.tests;

import edu.bbte.desktop_app.classes.LogAnalizer;
import edu.bbte.desktop_app.interfaces.FileExtMan;

public class TestableLogAnalizer extends LogAnalizer{
	private FileExtMan fileExtMan;
	
	public TestableLogAnalizer(FileExtMan fileExtMan){
		this.fileExtMan = fileExtMan;
	}
	
	@Override
	public FileExtMan getFileExtMan(){
		return fileExtMan;
	}
}
