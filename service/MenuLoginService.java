package projects.competitionApp.service;

import projects.competitionApp.util.MenuUtil;

import java.util.Scanner;

public class MenuLoginService implements MenuInterface {

    @Override
    public void process() {
        int count = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please login");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter user name: ");
            String userName = sc.nextLine();

            System.out.print("Enter password: ");
            String userPassword = sc.nextLine();

            if (!(userName.equals("Igrar") && userPassword.equals("12345"))) {
                count++;
            } else {
                System.out.println("Successfully login! \n");
                break;
            }
        }

        if (count == 3) {
            System.err.println("You banned!");

        }

        while (true) {
            MenuUtil.showMenu();
        }
    }
}
