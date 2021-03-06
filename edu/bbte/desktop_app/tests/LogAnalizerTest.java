package edu.bbte.desktop_app.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import edu.bbte.desktop_app.classes.FakeFileExtMan;
import edu.bbte.desktop_app.classes.LogAnalizer;
import edu.bbte.desktop_app.classes.ManFactory;
import edu.bbte.desktop_app.interfaces.FileExtMan;

@RunWith(Parameterized.class)
public class LogAnalizerTest {
	private LogAnalizer la;
	private FileExtMan fileExtMan;
	

    @Before
	public void setup(){
    	fileExtMan = new FakeFileExtMan(true);
		//la = new LogAnalizer(ManFactory.getInstance().getFileExtMan());
		ManFactory.getInstance().setFileExtMan(fileExtMan);
    	la = new TestableLogAnalizer();
	}
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { "log.slr",true }, { "log.slrr",false }, { "log.slr1",false }  
           });
    }

    @Parameter // first data value (0) is default
    public /* NOT private */ String fInput;

    @Parameter(value = 1)
    public /* NOT private */ Boolean fExpected;
	
	
	@Test(expected=IllegalArgumentException.class)
	public void isValidLogFileNameToShortExceptionThrow(){
		String logFileName = "";
		la.isValidLogFileName(logFileName);	
	}
	
	@Test
	public void isValidLogFileNameReturnTrue() throws IllegalArgumentException{
		//fileExtMan.setWillReturn(fExpected);
		//ManFactory.getInstance().getFileExtMan().setWillReturn(fExpected);
		la.getFileExtMan().setWillReturn(fExpected);
	    assertEquals(la.isValidLogFileName(fInput),fExpected);	
	}
}
