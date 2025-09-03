public class UserPasswordValidator extends Handler{
    public Database db;

    public UserPasswordValidator(Database db){
        this.db = db;
    }

    @Override
    public boolean execute(Request request){
        boolean isValidPassword = db.isValidPassword(request.username, request.password);
        if(isValidPassword){
            System.out.println("Password is valid");
            return handleNext(request);
        }else{
            System.out.println("password is not valid");
            return false;
        }
    }
}
