import java.util.ArrayList;
import java.util.List;

public class Store implements Publisher{
    List<Customer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Customer c){
        subscribers.add(c);
    }
    
    @Override
    public void notifySubscribers(String message){
        for(Customer c: subscribers){
            c.addMessage(message);
        }
    }
    
    @Override
    public void unsubscribe(Customer c){
        subscribers.remove(c);
    }
}