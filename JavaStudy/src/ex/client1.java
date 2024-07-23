package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 8888);
		OutputStream out = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(out, true);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				InputStream in;
				try {
					in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in);
					BufferedReader reader = new BufferedReader(isr);
					
					String msg = reader.readLine();
					System.out.println("서버 => " + msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();

		Scanner s = new Scanner(System.in);
		while (true) {
			String msg = s.next();
			writer.println(msg);

		}
	}

}
