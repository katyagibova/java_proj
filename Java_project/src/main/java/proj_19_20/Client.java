package proj_19_20;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner in= new Scanner(System.in);
        System.out.println("Your name:");
        String name = in.nextLine();

        while(true){
            System.out.println("Your message:");
            String message = in.nextLine();
            sendMessage(new Date() + " | " + name + " | " + message ,"255.255.255.255", 9087);
        }

    }

    public static void sendMessage(
            String message,
            String address,
            int port) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] data = message.getBytes();
        DatagramPacket packet = new DatagramPacket(
                data,
                0, data.length,
                InetAddress.getByName(address),
                port
        );
        socket.send(packet);
    }
}