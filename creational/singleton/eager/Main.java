public class Main{
	Logger logger;
	public static void main(String[] args){
		System.out.println("main started");
		logger = logger.getInstance();
		logger.log("first log message");
		logger.printLogs();
	}
}