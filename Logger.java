import java.util.ArrayList;

public class Logger{
	private static ArrayList<String> logs;
	private static Logger instance;

	private Logger(){
		logs = new ArrayList<String>();
	}

	public void log(String data){
		logs.add(data);
	}

	public static Logger getInstance(){
		if(instance == null){
			instance = new Logger();
		}
		return instance;
	}

	public void printLogs(){
		logs.forEach( (n)-> {System.out.println(n);});
	}
}