

public class recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //tail recursion;
        // if you are calling a function again and again , you can treat it as a separate call in the stack 
        print(n+1);//no need to return it because we don't have any return type
    }
}
