public abstract class Handler{
    private Handler next;

    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }

    public boolean handleNext(Request request){
        if(next == null){
            return true;
        }
        return next.execute(request);
    }

    public abstract boolean execute(Request request);
}
