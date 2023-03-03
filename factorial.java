public class factorial {
    public static void main(String[] args){
        int n = 3;
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans*i ;
        }
        System.out.println("factorial of "+ n + " is : " +ans );
    }
}
