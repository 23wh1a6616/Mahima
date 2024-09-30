import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        String x;
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.next();
        switch(x)
        {
        case "+":
                 System.out.println((a+b));
        case "-":
                 System.out.println((a+b));
        case "/":
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e1)
        {
             
            System.out.println("WRONG");
    }
    catch(NumberFormatException e2)
    {
        System.out.println("A or B is not a number");
    }
}
}
}
