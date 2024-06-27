package Practice.symboisis;

public class swapNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);



        int a = 5;
        int b = 10;
        
        a = a + b; // a becomes 15
        b = a - b; // b becomes 5 (original value of a)
        a = a - b; // a becomes 10 (original value of b)
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
