package practice.ch02;

// 어댑터 역할을 하는 클래스
public class PrintBanner extends Banner implements Print {


	public PrintBanner(String string) {
		super(string);
	}

	// Banner로부터 상속받은 showWithParen()을 호출한다.
	public void printWeak() {  //12v를 호출하면 220v가 일을 한다.
		showWithParen();
	}

	// 상속받은 showWithAster( )를 호출한다.
	public void printStrong() {
		showWithAster();
	}
}
