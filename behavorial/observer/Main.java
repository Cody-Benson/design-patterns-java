public class Main{
    public static void main(String[] args){
        Store store = new Store();
        Customer john = new Customer("john");
        Customer cody = new Customer("cody");

        store.subscribe(john);
        store.notifySubscribers("message 1");

        john.printMessages();
        cody.printMessages();

        store.notifySubscribers("message 2");

        john.printMessages();
        cody.printMessages();

        store.subscribe(cody);
        store.notifySubscribers("message 3");

        john.printMessages();
        cody.printMessages();

        store.unsubscribe(john);
        store.notifySubscribers("message 4");

        john.printMessages();
        cody.printMessages();
    }
}