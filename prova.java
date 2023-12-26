public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.err.println("ciaocome va");
        System.err.println("no non stai lavorando idiota");

        System.out.println("Fibonacci di 5 è: " + fibonacci(5));
    }
    
    public static int fibonacci(int x){
        if(x==0) 
            return x;
        else if(x==1) 
            return x;
        else 
            return fibonacci(x-1)+ fibonacci(x-2);
    }
}
