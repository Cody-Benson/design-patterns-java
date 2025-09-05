import java.util.ArrayList;
import java.util.List;

public class Customer implements Subscriber{
    private List<String> messages = new ArrayList<>();
    private String name;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printMessages(){
        System.out.println("messages for " + this.name + " are:");
        for(String m:messages){
            System.out.println(m);
        }
        System.out.println();
    }
    
    @Override
    public void addMessage(String message){
        System.out.println(this.name + " is adding message:" + message);
        this.messages.add(message);
    }
}
