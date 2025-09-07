public class Main {
    public static void main(String[] args){
        GoodStudent goodStudent = new GoodStudent("chad");
        BadStudent badStudent = new BadStudent("cody");

        goodStudent.study();
        System.out.println();
        badStudent.study();
    }
}