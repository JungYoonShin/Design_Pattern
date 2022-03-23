package practice.ch01;

// 책꽂이에 꽂힐 책을 나타내는 클래스
public class Book{
	private String name;
	
	public Book(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

// Book b1 = new Book("자바");