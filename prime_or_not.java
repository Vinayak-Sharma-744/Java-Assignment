


public class prime_or_not {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in); 

        int a = 29;
        Boolean b = false;
        if (a<2 && a>=0) {
            b = true;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                b = true;
                break;
            }
        }

        if (b==true) {
            System.out.println(a + " is not prime");
        } else {
            System.out.println(a + " is prime");
        }
    }
}
