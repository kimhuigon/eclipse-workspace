package ch13;

public class PolymorphismMain{
  public static void main(String[] args) {
    Notebook notebook = new Notebook();
    notebook.setRouter(new Router() {
		
		@Override
		public String disconnect() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String connect() {
			// TODO Auto-generated method stub
			return null;
		}
	});
    notebook.connect();
    notebook.disconnect();

    Notebook notebook2 = new Notebook();
    notebook2.setRouter(new IpTimeRouter());
    notebook2.connect();
    notebook2.disconnect();

    Notebook notebook3 = new Notebook();
    notebook3.setRouter(new AsusRouter());
    notebook3.connect();
    notebook3.disconnect();
  }
}
