package edu.bbte.desktop_app.classes;

import edu.bbte.desktop_app.interfaces.FileExtMan;

public class FakeFileExtMan implements FileExtMan{
	private boolean willReturn;
	
	public FakeFileExtMan(boolean willReturn) {
		this.willReturn = willReturn;
	}
	
	@Override
	public void setWillReturn(boolean willReturn){
		this.willReturn = willReturn;
	}
	
	@Override
	public boolean isValid(String str) {
		return willReturn;
	}

}
