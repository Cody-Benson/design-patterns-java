public class Main {
    public static void main(String[] args){
        Database db = new Database();
        db.addUser("cody", "password");
        db.addUser("admin", "adminpassword");

        Request request1 = new Request("cody", "password", "user");
        Request request2 = new Request("cody", "p", "user");
        Request request3 = new Request("admin", "password", "admin");

        Handler handler = new UserNameValidator(db);
        Handler handler2 = new UserPasswordValidator(db);
        Handler handler3 = new UserRoleValidator();
        handler.setNext(handler2);
        handler2.setNext(handler3);

        System.out.println("executing request 1");
        handler.execute(request1);
        System.out.println("finished request 1");
        System.out.println("executing request 2");
        handler.execute(request2);
        System.out.println("finished request 2");
        System.out.println("executing request 3");
        handler.execute(request3);
        System.out.println("finished request 3");
    }
}
