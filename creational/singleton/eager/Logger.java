import java.util.ArrayList;
public class Logger{
	private static Logger instance = new Logger();
	private ArrayList<String> logs = new ArrayList<String>();

	private Logger(){}

	public Logger getInstance(){
		return instance;
	}

	public void log(String message){
		logs.add("first log");
	}

	public void printLogs(){
		logs.forEach((log) -> {System.out.println(log);});
	}
}