
import org.json.JSONArray;

import org.json.JSONObject;

public class Data {
 

String str;

int Int;
JSONObject object;
{	String json= "{\"name\":\"Egypt\",\"capital\":\"Cairo\",\"region\":\"Africa\",\"callingCodes\":20}";
	 object = new JSONObject (json);
 
}
	  
public String getString(String key)
{
	
	str= object.getString(key);
	System.out.print(str);
	return str;

}
public int getInt(String key)
{
	
	Int= object.getInt(key);
	System.out.print(Int);
	return Int;

}
}

	  		  
		    		  
		    		  
		    		  
/*		    		  ("[ {\n" +
		"    "name": "Colombia",\n" +
		"    "capital": "Bogotá",\n" +
		"    "region": "Americas",\n" +
		"    "population": 48759958,\n" +
		"    }]"
		      );
	*/	 

