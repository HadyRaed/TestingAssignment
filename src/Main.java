import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.net.httpserver.HttpServer;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException {

		connection conn= new connection();


		String ApiUrl;

		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

		server.createContext("/test"), new MyHandler());
		server.setExecutor(null); 
		server.start();

	}
}
/*public static void  parse (String response)
    { 
    JSONArray array= new JSONArray(response);
    for (int i = 0 ;i <array.length();i++)
    {
    JSONObject obj = array.getJSONObject(i);
        String name = obj.getString("name");
     //   String topLevelDomain = obj.getString("topLevelDomain");
      //  String capital = obj.getString("captial");
        System.out.println(name);
    }*/


