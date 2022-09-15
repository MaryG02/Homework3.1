import java.util.Scanner;
public class hometask3 {
    public static void main(String[] args) {
        // 1.1 && 1.2 && 1.4

        if ((1 < 10 && 5 >= 3) || (5 != 3 + 3))
            System.out.println("True");
        else
            System.out.println("Math is broken");

        String food = "orange";
        switch (food) {
            case "orange":
                System.out.println("It is a fruit");
                break;
            case "tomato":
                System.out.println("It is a vegetable");
                break;
            case "watermelon":
                System.out.println("It is a berry");
            default:
                System.out.println("It is not a food!");
        }



        // 1.3 && 1.5 && 1.6
        System.out.println("Guess a fruit which is also a brand");
        String input;
        String answer = "apple";
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        if (answer.equals(input))
            System.out.println("That is correct!");
        else
            System.out.println("You are wrong");


        int smth = 3;
        if (smth==10)
            System.out.println("Equal 10");
        else if(smth>10)
            System.out.println("Bigger than 10");
        else
            System.out.println("Less than 10");

    }
    }


