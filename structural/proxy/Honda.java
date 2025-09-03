public class Honda implements Vehicle{
    @Override
    public void drive(User user){
        System.out.println("user " + user.getName() + " is driving");
    }
}