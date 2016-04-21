package edu.bbte.desktop_app.main;

import edu.bbte.desktop_app.classes.ManFactory;

public class Main {
	//private LogAnalizer la;
	private String s;
	//private FileExtMan fileExtMan;
	
	public Main(String s){
		this.s = s;
		//ide a megirt fileExtMan kell, csak azert van benn, hogy ne okozzon hibat
		//fileExtMan = new FakeFileExtMan(true);
		//la = new LogAnalizer(fileExtMan);
	}
	
	private boolean isLog(){
		//return la.isValidLogFileName(s);
		return ManFactory.getInstance().getFileExtMan().isValid(s);
	}
	
	public static void main(String[] args){
		Main m = new Main("test.log");
		System.out.println(m.isLog());
	}
	
}