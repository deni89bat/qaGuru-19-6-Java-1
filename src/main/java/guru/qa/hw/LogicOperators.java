package guru.qa.hw;

import java.util.Scanner;

public class LogicOperators {
    public static void main(String[] args) {
        Scanner marriage = new Scanner(System.in);
        System.out.println("Are you married? Yes or no: ");
        String familyStatus = marriage.nextLine();
        if (familyStatus.equalsIgnoreCase("yes")) {
            Scanner child = new Scanner(System.in);
            System.out.println("How many children do you have: ");
            int childCheck = child.nextInt();
            if (familyStatus.equalsIgnoreCase("yes") && childCheck >= 2) {
                System.out.println("Congratulations! You can get a family mortgage!");
            } else {
                System.out.println("Sorry. You have been denied a family mortgage.You have less than two children.");

            }
        } else {
            System.out.println("Sorry. You have been denied a family mortgage. You are not married.");

        }

    }
}
