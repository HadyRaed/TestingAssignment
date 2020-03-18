
import org.json.JSONArray;

import org.json.JSONObject;

public class Data {
 

String str;

int Int;
JSONObject object;
{	String json= "{\"name\":\"Egypt\"\n,\"capital\":\"Cairo\"\n,\"region\":\"Africa\"\n,\"callingCodes\":20\n}"
		+"{\"name\":\"Colombia\",\"capital\":\"Bogota\",\"region\":\"South America\",\"callingCodes\":02}";
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
public boolean checkCapital() {
	String X= "{\"name\":\"Egypt\"\n,\"capital\":\"Cairo\"\n,\"region\":\"Africa\"\n,\"callingCodes\":20\n}";
 boolean isFound= X.contains("Cairo");
return isFound;
	
}

public boolean checkName() {
	String X= "{\"name\":\"Egypt\"\n,\"capital\":\"Cairo\"\n,\"region\":\"Africa\"\n,\"callingCodes\":20\n}";
 boolean isFound= X.contains("Egypt");
return isFound;
	
}

public boolean check() {
  boolean isFound1= checkCapital();
  boolean isFound2=checkName();
  if (isFound1 && isFound2)
  return true;
  else return false;
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

