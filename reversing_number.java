public class reversing_number {
    public static void main(String[] args){
        int a = 12345;

        while (a>0) {
            System.out.print(a % 10 + " ");
            a = a/10;
        }
       
    }
}
