package edu.bbte.desktop_app.classes;

import edu.bbte.desktop_app.headers.LogAnalizerInterface;

public class LogAnalizer implements LogAnalizerInterface{

	@Override
	public boolean isValidLogFileName(String s) {
		if(s.length()<3){
			throw new IllegalArgumentException("Name is to short!");
		}
		
		String[] sl = s.split("\\.");
		if(sl[sl.length-1].toLowerCase().equals("slr")){
			return true;
		}
		return false;
	}

}
