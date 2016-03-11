package edu.bbte.desktop_app.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import edu.bbte.desktop_app.classes.LogAnalizer;

public class LogAnalizerTest {
	private LogAnalizer la;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 { "log.slr",true }, { "log.slrr",false }, { "",false }  
           });
    }

    @Parameter // first data value (0) is default
    public /* NOT private */ String fInput;

    @Parameter(value = 1)
    public /* NOT private */ Boolean fExpected;
	
	@Before
	public void setup(){
		la = new LogAnalizer();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void isValidLogFileNameToShortExceptionThrow(){
		String logFileName = "";
		la.isValidLogFileName(logFileName);	
	}
	
	@Test
	public void isValidLogFileNameReturnTrue(){
		//String logFileName = "test.slr";
	    assertEquals(la.isValidLogFileName(fInput),fExpected);	
	}
}
