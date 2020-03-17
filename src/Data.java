import org.json.JSONArray;
import org.json.JSONObject;

public class Data {
 

String str;
public String staticData() {
	String json= "{\"name\":\"Colombia\",\"capital\":\"Bogot\"}";
	JSONObject object = new JSONObject (json);
 str= object.getString("name");
 System.out.print(str);
 return str;
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

