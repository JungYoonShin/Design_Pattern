package practice.ch01;

// 책꽂이에 꽂힌 책을 차례차례 돌아다니는데 사용될 클래스
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


