package practice.ch02;

// ����� ������ �ϴ� Ŭ����
public class PrintBanner extends Banner implements Print {


	public PrintBanner(String string) {
		super(string);
	}

	// Banner�κ��� ��ӹ��� showWithParen()�� ȣ���Ѵ�.
	public void printWeak() {  //12v�� ȣ���ϸ� 220v�� ���� �Ѵ�.
		showWithParen();
	}

	// ��ӹ��� showWithAster( )�� ȣ���Ѵ�.
	public void printStrong() {
		showWithAster();
	}
}
