import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;


class unitTest {
Data data = new Data();


String obj ;

	@Test
	void testName1() {
		final String expected = "Egypt";
		final String actual = data.getString("name");
		
		
		Assert.assertEquals(actual,expected);
	}
	
	
	@Test
	void testCaptial() {
		final String expected = "Cairo";
		final String actual = data.getString("capital");
		
		Assert.assertEquals(actual,expected);
	}
	@Test
	void testRegion() {
		final String expected = "Africa";
		final String actual = data.getString("region");
		
		Assert.assertEquals(actual,expected);
	}
	@Test
	void testcallingCodes() {
		final int expected = 20;
		final int actual = data.getInt("callingCodes");

		Assert.assertEquals(actual,expected);
	}
	
	@Test
	void integrationTest() {
		final boolean expected =true;
		final boolean actual =data.check();
		
		Assert.assertEquals(actual, expected);
		
		
	};
	

}
