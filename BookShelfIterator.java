package practice.ch01;

// å���̿� ���� å�� �������� ���ƴٴϴµ� ���� Ŭ����
public class BookShelfIterator implements Iterator{
	private BookShelf shelf;
	private int index;
	
	public BookShelfIterator(BookShelf shelf) {
		this.shelf = shelf;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index < shelf.getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = shelf.getBookFrom(index);
		index++;
		return book;
		
	}
	
}


