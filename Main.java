class Main{
	public static void main(String[] args){
		Logger logger = Logger.getInstance();
		logger.log("hello");
		logger.log("there");

		logger.printLogs();

		Logger logger2 = Logger.getInstance();
		logger2.printLogs();
	}
}