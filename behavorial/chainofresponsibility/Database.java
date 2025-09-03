import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String,String> users = new HashMap<>();

    public boolean isValidUser(String userName){
        return users.containsKey(userName);
    }

    public boolean isValidPassword(String userName, String password){
        String storedPassword = users.get(userName);
        return (storedPassword.equals(password));
    }

    public void addUser(String user, String password){
        users.put(user, password);
    }
}
