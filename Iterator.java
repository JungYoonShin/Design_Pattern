package practice.ch01;

// 모든 Iterator가 가져야 할 메소드를 선언한 인터페이스
public interface Iterator{
	public abstract boolean hasNext();
	public abstract Object next();
}