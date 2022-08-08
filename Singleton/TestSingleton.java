public class TestSingleton{
    public static void main(String args[]) {
        Singleton president1 = Singleton.getInstance();
        Singleton president2 = Singleton.getInstance();
        System.out.println(president1);
        System.out.println(president2);
    }
}
