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
	return str;

}
public int getInt(String key)
{
	
	Int= object.getInt(key);
	return Int;

}
}
	  		  
		    		  
		    		  
		    		  


