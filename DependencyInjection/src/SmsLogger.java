
public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Smse Loglandı: " + message);
	}

}
