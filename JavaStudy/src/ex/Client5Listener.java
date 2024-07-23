package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Client5Listener extends Thread{
	private InputStream in;
	public Client5Listener(InputStream in) {
	this.in = in;
	}
	@Override
	public void run() {
	InputStreamReader isr = null;
	BufferedReader reader = null;
	try {
	isr = new InputStreamReader(in, "utf-8");
	reader = new BufferedReader(isr);
	while(true) {
	String data = reader.readLine();
	if(data == null) break;
	System.out.println(data);
	}
	} catch (IOException e) { e.printStackTrace(); }
	}

}
