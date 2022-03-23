package practice.ch01;

public class Main {
	// 모든 자바 프로그램은 main() 메소드부터 시작된다.
    public static void main(String[] args) {
    	BookShelf bookshelf1 = new BookShelf(4);
    	
    	bookshelf1.appendBook(new Book("홍길동"));
    	bookshelf1.appendBook(new Book("심청전"));
    	bookshelf1.appendBook(new Book("해빙"));
    	bookshelf1.appendBook(new Book("달러구트 꿈 백화점"));
    	
    	Iterator i1 = bookshelf1.iterator();
    	while(i1.hasNext()) {
    		Book book = (Book)i1.next();
    		System.out.println(book.getName());
    		
    		
    	}
    	
    }
}





