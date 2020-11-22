package proj_19_20;


import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

    public class Server {
        public static void main(String[] args) throws IOException {
            DatagramSocket socket = new DatagramSocket(9087);
            byte[] buffer = new byte[2024];
            DatagramPacket packet = new DatagramPacket(
                    buffer,
                    0,
                    buffer.length);
            System.out.println("listening on 9087");
            while (true) {
                socket.receive(packet);
                String message = new String(buffer, 0 , buffer.length);
                System.out.println(message);
                FileWriter writer = new FileWriter("src/proj_19_20/History.txt", true);
                try{
                    writer.write(message);
                }catch (IOException e) {
                    System.out.println("Eror");
                }finally {
                    writer.close();
                }

            }
        }
    }
