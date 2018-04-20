import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
public class ChatClient {
    public static void main(String args[]){
         ChatClient cc=new ChatClient();
		 cc.go();
    }
    public void go() {
		try{
		Scanner s=new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 5000);
		InputStreamReader stream;
		BufferedReader reader;
        PrintWriter writer;
		System.out.println("Connection established :");
		while (true)
		{
			
			String str=s.nextLine();
			writer = new PrintWriter(sock.getOutputStream());
            writer.println(str);
            writer.flush();
			stream=new InputStreamReader(sock.getInputStream());
			reader=new BufferedReader(stream);
		    String  msg=reader.readLine();
		    System.out.println(msg);
			
		   }
		  
		
		}catch(Exception e){}
        
    }
}

