package mod008;

public class TryCatch2 {
	public static void main(String[] args) {
		int sum = 0;
		for (String arg : args) {
			try {
				sum += Integer.parseInt(arg);
			} catch (NumberFormatException nfe) {
				System.err.println("[" + arg + "] is not an integer"
						+ "and will not be included in the sum.");
			}
		}
		System.out.println("Sum =" + sum);
	} // 3 1 two 3.0 4
}
