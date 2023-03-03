public class Swap_without_3rd_variable {
    public static void main(String[] args) {

        int a,b;

        a = 10;
        b = 20;

        System.out.println("value of a before swap "+a);
        System.out.println("value of b before swap "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("value of a after swap "+a);
        System.out.println("value of b after swap "+b);
    }
}