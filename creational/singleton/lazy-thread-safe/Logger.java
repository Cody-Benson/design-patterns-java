import java.util.ArrayList;

class Logger{
	private static Logger instance;
	private ArrayList<String> logs;

	private Logger(){
		logs = new ArrayList<>();
	}

	public synchronized static Logger getInstance(){
		if(instance == null){
			instance = new Logger();
			return instance;
		}else{
			return instance;
		}
	}

	public void printLogs(){
		logs.forEach((log)->{System.out.println(log);});
	}

	public synchronized void log(String data){
		logs.add(data);
	}
}