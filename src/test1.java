public class test1 {
    {System.out.println("1");}
    static {System.out.println("5");}
    public test1(){

        System.out.println("2?");
    }

    public test1(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        test2 testM = new test2(7);
        System.out.println("hello "+testM.x);
    }
}
