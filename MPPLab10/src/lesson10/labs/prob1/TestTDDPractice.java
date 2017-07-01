package lesson10.labs.prob1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestTDDPractice {

	@Test
	public void test() {
		//fail("Not yet implemented");
		TDDPractice tdd = new TDDPractice();
		List<String> src = new ArrayList<String>();
		src.add("yahoo");
		src.add("google");
		src.add("user");
		src.add("microsoft");
		
		List<String> dst = new ArrayList<String>();
		dst.add("yahoO");
		dst.add("googlE");
		dst.add("useR");
		dst.add("microsofT");
		
	       assertTrue("Test changeLastCharToUpper", dst.equals(tdd.changeLastCharToUpper(src)));
	}

}
