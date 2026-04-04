import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
//        greeting();
//    }
//    static void greeting(){
//        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        myGreet(name);

//        System.out.println(message);
    }
    static void myGreet(String name){
        String message = "Hello "+name+"!";
        System.out.println(message);


    }
}
