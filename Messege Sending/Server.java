import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7777);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            while(true){
                String str  = (String)dis.readUTF();

                
                if(str.compareTo("Exit")==0){
                    System.out.println("SERVER Closed");
                    ss.close();
                    break;
                }
                System.out.println(str);
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}