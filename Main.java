class Main {
	private static String DEFAULT_MESSAGE = "world";

	public static void main(String[] args) {
		Hello hello = new Hello(System.out);
		hello.hello(getMessageOrDefault(args));
	}
	
	private static String getMessageOrDefault(String[] args) {
		if (args.length > 0) {
			return args[0];
		}
		return DEFAULT_MESSAGE; 
	}
}