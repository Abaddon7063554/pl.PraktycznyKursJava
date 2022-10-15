package ftp;
import java.io.*;

import org.apache.commons.net.ftp.FTPClient;

public class polaczenie{
public static void main(String [] args)
    {
        String server = "ftp://192.168.210.29";
        int port = 21;
        String user = "login";
        String pass = "haslo";
        FTPClient ftpClient = new FTPClient();
        try {
 
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();
 
            //ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
 
            // APPROACH #1: uploads first file using an InputStream
            
 
            // APPROACH #2: uploads second file using an OutputStream
           
           
        } catch (IOException ex) {
            System.out.println("Error: nie polaczono" + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
