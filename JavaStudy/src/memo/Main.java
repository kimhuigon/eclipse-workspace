package memo;

public class Main {
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		Note n1 = new Note();
		n1.setContent("1page");
		nb.addNote(n1);
		
		Note n2 = new Note();
		n2.setContent("2page");
		nb.addNote(n2);
		
		Note note = nb.readNote(2);
		System.out.println(note.getContent());
		
		int count = nb.countNote();
		System.out.println(count);
		
		nb.removeNote(2);
		Note note2 = nb.readNote(2);
		System.out.println(note2.getContent());
	}

}
