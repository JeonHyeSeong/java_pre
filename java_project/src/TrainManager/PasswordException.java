package TrainManager;

public class PasswordException extends IllegalArgumentException {
	//사용자정의 Exception 생성할 때 IllegalArgumentException
	public PasswordException(String message) {
		System.out.println(message);

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		
	}
}