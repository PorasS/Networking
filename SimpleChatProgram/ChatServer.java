import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class ChatServer {
	public static void main(String args[]){
		 ChatServer cs=new ChatServer();
		 cs.go();
	}
	public void go(){
		try{
			Scanner s=new Scanner(System.in);
		   ServerSocket servsock=new ServerSocket(5000);
		   Socket sock=servsock.accept();
		while(true){
			 InputStreamReader stream=new InputStreamReader(sock.getInputStream());
			BufferedReader reader=new BufferedReader(stream);
			String msg=reader.readLine();
			System.out.println(msg);
			PrintWriter writer =new PrintWriter(sock.getOutputStream());
			String str=s.nextLine();
			writer.println(str);
			writer.flush();
		}
		}catch(Exception e){}
	   
	}
}
