public interface Publisher {
    void subscribe(Customer c);
    void notifySubscribers(String message);
    void unsubscribe(Customer c);
}