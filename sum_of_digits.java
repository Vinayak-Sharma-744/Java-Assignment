public class sum_of_digits {
    public static void main(String[] args){
        int a = 12345;
        int ex = a;
        int mod;
        int b = 0;

        while (a>0) {
            mod = a%10;
            b = b + mod;
            a=a/10;
        } 
        System.out.println("sum of " + ex + " is : " + b);
    }
}
