public class App {
    static void easy(int n){
        if(n<1) return;
        easy(n-2);
        System.out.println(n);
        easy(n-3);
        System.out.println(n);
    }
    public static void main(String[] args) {
        easy(5);
    }
}
