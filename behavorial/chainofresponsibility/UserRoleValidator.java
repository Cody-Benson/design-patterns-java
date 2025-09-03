public class UserRoleValidator extends Handler{
    @Override
    public boolean execute(Request request){
        if(request.username.equals("cody")){
            System.out.println("cody is allowed to do user actions");
            return handleNext(request);
        }
        else if(request.username.equals("admin")){
            System.out.println("admin is allowed to do admin actions");
            return handleNext(request);
        }
        else{
            System.out.println("user " + request.username + "is banned.");
            return false;
        }
    }
}
