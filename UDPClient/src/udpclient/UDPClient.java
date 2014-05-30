/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udpclient;
import java.util.Scanner;
import java.io.*;
import java.net.*;
/**
 *
 * @author keykeyair
 */
public class UDPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //InputStream in = System.in;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input ip address:");
        String IPAddres = scanner.next();
        System.out.print("input port:");
        int port = scanner.nextInt();
        System.out.println("my get id is:" + IPAddres);
        System.out.println("my get port is:" + port);
    }
    
}
