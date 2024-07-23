package ch14;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1234);
			ss.accept();
			System.out.println("클라이언트 접속");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
