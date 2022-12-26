package projects.competitionApp.util;

import projects.competitionApp.bean.Config;
import projects.competitionApp.service.MenuLoginService;
import projects.competitionApp.service.MenuRegisterService;
import projects.competitionApp.service.MenuStartService;

import java.util.Scanner;

public class MenuUtil {
    public static void login() {
        MenuLoginService menuLoginService = new MenuLoginService();
        menuLoginService.process();
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i]);
        }
    }

    public static void showMenu() {
        showAllMenu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: ");
        int number = sc.nextInt();

        if (number == 1) {
            MenuRegisterService registerService = new MenuRegisterService();
            registerService.process();
            System.out.println("Choose next process\n");
            showMenu();
        } else if (number == 2) {
            if (Config.registeredPerson == 0) {
                System.out.println("You first register\n");
                showMenu();
            } else {
                MenuStartService startService = new MenuStartService();
                startService.process();
            }
        } else if (number == 3) {
            System.out.println("Logged...");
            MenuLoginService loginService = new MenuLoginService();
            loginService.process();
        } else if (number == 4) {
            System.out.println("Exit...");
            System.exit(0);
        } else {
            System.out.println("Wrong choose!\nTry again\n");
            showMenu();
        }
    }

}
