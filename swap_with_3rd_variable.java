public class swap_with_3rd_variable {
    public static void main(String[] args) {

        int a,b,c;

        a = 10;
        b = 20;

        System.out.println("value of a before swap "+a);
        System.out.println("value of b before swap "+b);
        c = a;
        a = b;
        b = c;

        System.out.println("value of a after swap "+a);
        System.out.println("value of b after swap "+b);
    }
}
