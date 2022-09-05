import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",7777);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            while(true){
                Scanner scan  = new Scanner(System.in);
                String str = scan.nextLine();
                dos.writeUTF(str);
                dos.flush();
                if(str.compareTo("Exit")==0){
                    s.close();
                    break;
                }
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
    }
}
}
