package practice.ch01;


public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int num) {
		books = new Book[num];

	}
	public void appendBook(Book book) {
		books[last] = book;
		last++;
	}
	
	 // 입력인자인 index에 해당하는 책을 반환하는 메소드
    public Book getBookFrom(int index) {
        return books[index];
    }

	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	
	
	
}






