package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("대기중...");
		Socket socket = ss.accept();
		System.out.println("클라이언트 접속");
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				InputStream in;
				try {
					in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in);
					BufferedReader reader = new BufferedReader(isr);
					
					String msg = reader.readLine();
					System.out.println("클라이언트 => " + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out, true);

		Scanner s = new Scanner(System.in);
		while (true) {
			String msg = s.next();
			writer.println(msg);
			
		}
	}

}
