package banking;

public class OverChargeException extends RuntimeException {
	public OverChargeException(String msg) {
		super(msg);
	}
}
