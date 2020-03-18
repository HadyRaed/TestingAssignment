	import java.io.IOException;
	import java.io.OutputStream;
	import java.net.InetSocketAddress;

	import com.sun.net.httpserver.HttpExchange;
	import com.sun.net.httpserver.HttpHandler;
	import com.sun.net.httpserver.HttpServer;

	
	    class MyHandler implements HttpHandler {
	        connection con=new connection();
	    	@Override
	        public void handle(HttpExchange t) throws IOException {
	    		 System.out.println(con.output.toString());
	            String response =con.EstablishConnection();
	       
	            
	            t.sendResponseHeaders(200, response.length());
	            OutputStream os = t.getResponseBody();
	            os.write(response.getBytes());
	            os.close();
	        }
	    }

	


