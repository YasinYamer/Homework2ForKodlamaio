package nLayeredHomework.core;

public class MailLogger implements Logger {

	@Override
	public void log(String log) {
			System.out.println("Mail ile Loglandı : "+ log);
	}

}
