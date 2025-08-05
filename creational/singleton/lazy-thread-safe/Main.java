class Main{
	public static void main(String[] args){
		System.out.println("lazy thread safe");
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

		logger1.log("hello");
		logger2.log("bye");

		System.out.println("logger 1 logs");
		logger1.printLogs();
		
		System.out.println("logger 2 logs");
		logger2.printLogs();
	}
}