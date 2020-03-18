import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
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


public class connection {
	private static HttpURLConnection connection;

	StringBuffer output = new StringBuffer(); 
	private String out;

	public String EstablishConnection() throws IOException{
		BufferedReader reader;
		String line;
		String str = null;


		try {
			/*opening connection*/
			URL url = new URL("https://restcountries.eu/rest/v2/name/egypt?fields=name;capital;currencies");
			connection = (HttpURLConnection) url.openConnection();

			/*request*/
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(10000);
			connection.setReadTimeout(10000);
			int status = connection.getResponseCode();
			System.out.println(status);

			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while ((line = reader.readLine()) != null) {
					output.append(line);

				}
				str=output.toString();

				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while ((line = reader.readLine()) != null) {
					output.append(line);

				}
                  str=output.toString();                 
				reader.close();
			}
			


			
		} catch (MalformedURLException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
		return str;
		

}

	
}


