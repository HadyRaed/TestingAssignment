/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 *///
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	
	

	private static HttpURLConnection connection;
	private static Scanner scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    	
    	Data data=new Data();
    	data.staticData();

    
    	BufferedReader reader;
        String line;
        StringBuffer output = new StringBuffer();    //append each line
        String ApiUrl;
        scanner = new Scanner(System.in);
        ApiUrl=scanner.nextLine();
        
        try {
            /*opening connection*/
            URL url = new URL(ApiUrl);
            connection = (HttpURLConnection) url.openConnection();

            /*request*/
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int status = connection.getResponseCode();
            System.out.println(status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    output.append(line);

                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    output.append(line);

                }
                reader.close();
            }
            

            System.out.print(output.toString());
              parse(output.toString());

        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    
    
    
    
    }
    
    public static void  parse (String response)
    { 
    JSONArray array= new JSONArray(response);
    for (int i = 0 ;i <array.length();i++)
    {
    JSONObject obj = array.getJSONObject(i);
        String name = obj.getString("name");
     //   String topLevelDomain = obj.getString("topLevelDomain");
      //  String capital = obj.getString("captial");
        System.out.println(name);
    }

}}
