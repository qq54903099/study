package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPEchoServer {
	public static void main(String[] args) throws IOException {
		
		
		DatagramSocket ds = new DatagramSocket(3111);
		
		DatagramPacket dpr = new DatagramPacket(new byte[125], 125);
		
		while(true){
			
			ds.receive(dpr);
			System.out.println("recv:"+dpr.getSocketAddress());
			ds.send(dpr);
		}
		
	}
}
