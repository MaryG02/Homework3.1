import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Hello! please type in your age");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        if(age<=6)
            System.out.println("I guess you are going to kindergarten");
        else if(age<=17)
            System.out.println("I guess you are going to school");
        else if(age<=22)
            System.out.println("I guess you are going to university");
        else if(age<=60)
            System.out.println("I guess you are going to work");
        else if(age>60)
            System.out.println("I guess you are retired now, congrats!");
    }
}
