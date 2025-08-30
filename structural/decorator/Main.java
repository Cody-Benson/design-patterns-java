public class Main {
    public static void main(String[] args){
        Notifier emailNotifier = new EmailNotifier();
        Notifier textNotifier = new TextNotifier();

        emailNotifier.sendNotification();
        textNotifier.sendNotification();

        FacebookDecorator fbDecorator = new FacebookDecorator(textNotifier);
        fbDecorator.sendNotification();
    }
}
