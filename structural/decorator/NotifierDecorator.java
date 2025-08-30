public abstract class NotifierDecorator implements Notifier{
    public Notifier decoratedNotifier;

    public NotifierDecorator(Notifier notifier){
        this.decoratedNotifier = notifier;
    }

    @Override
    public void sendNotification(){
        decoratedNotifier.sendNotification();
    }
    
}
