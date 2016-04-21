package edu.bbte.desktop_app.classes;

public class LogAnalizer{

	//private FileExtMan fileExtMan;
	
	/*public LogAnalizer(FileExtMan fileExtMan){
		this.fileExtMan = fileExtMan;
	}*/
	public LogAnalizer(){
		
	}
	
	public boolean isValidLogFileName(String s) {
		if(s.length()<3){
			throw new IllegalArgumentException("Name is to short!");
		}
		
		return ManFactory.getInstance().getFileExtMan().isValid(s);
		//return fileExtMan.isValid(s);
	}

}
