public class FacebookDecorator extends NotifierDecorator{
    public FacebookDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendNotification(){
        super.sendNotification();
        System.out.println("and Sending fb notification.");
    }
    
}
