package ch11;

public class USBMain {
	public static void main(String[] args) {
		S_USB usb = new S_USB();
		L_USB usb2 = new L_USB();

		USB[] usbs = { usb, usb2 };
		for (int i = 0; i < usbs.length; i++) {
			usbs[i].copy();
//			if (usbs[i] instanceof S_USB) {
//				((S_USB) usbs[i]).checkCapacity(); 근데 안 씀ㅋㅋ
//			}

		}
	}
}