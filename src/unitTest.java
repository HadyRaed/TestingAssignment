import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;


class unitTest {
Data data = new Data();
String obj = data.staticData();

	@Test
	void test() {
		final String expected = "Colombia";
		final String actual = obj;
		
		Assert.assertEquals(actual,expected);
	}

}
