package edu.bbte.desktop_app.main;

import edu.bbte.desktop_app.classes.LogAnalizer;

public class Main {
	private LogAnalizer la;
	private String s;
	public Main(String s){
		this.s = s;
		la = new LogAnalizer();
	}
	
	private boolean isLog(){
		return la.isValidLogFileName(s);
	}
	
	public static void main(String[] args){
		Main m = new Main("test.log");
		System.out.println(m.isLog());
	}
	
}