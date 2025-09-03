public class UserNameValidator extends Handler{
    public Database db;

    public UserNameValidator(Database db){
        this.db = db;
    }

    @Override
    public boolean execute(Request request){
        if(db.isValidUser(request.username)){
            System.out.println("username:" + request.username + " exists.");
            return handleNext(request);
        }else{
            System.out.println("username:" + request.username + " does not exist.");
            return false;
        }
    }
}