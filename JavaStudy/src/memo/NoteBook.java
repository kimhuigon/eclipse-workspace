package memo;

public class NoteBook {
	Note[] notes = new Note[10]; // 전역변수
	int page = 0; // 저장용
	
	public Note readNote(int page) { // 조회용
		return notes[page-1];
	}
	
	public void addNote(Note note ) {
		notes[page] = note;
		page += 1;
	}
	
	public void removeNote(int page) {
		notes[page -1] = null;
	}
	
	public int countNote() {
		int count = 0;
		for(int i = 0; i < notes.length; i++) {
			if(notes[i] != null) {
				count += 1;
			}
		}
		return count;
	}

}
