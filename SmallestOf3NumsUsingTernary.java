public class SmallestOf3NumsUsingTernary {
    public static void main(String args[]) {
       int a, b, c, temp, result;
       a = 10;
       b = 20;
       c = 30;
       temp = a > b ? a:b;
       result = c > temp ? c:temp;
       System.out.println("Smallest number is ::"+result);
    }
 }