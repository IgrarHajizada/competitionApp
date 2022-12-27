package projects.competitionApp.service;

import java.util.Random;
import java.util.Scanner;

import projects.competitionApp.bean.Config;
import projects.competitionApp.service.MenuRegisterService;

public class MenuStartService implements MenuInterface {

 

    @Override
    public void process() {
        Random random = new Random();
        int number = random.nextInt(Config.registeredPerson);
        System.out.println("Who is the chosen participant?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: ");
        int chooseNumber = sc.nextInt();

        if (number == chooseNumber) {
            System.out.println("Congratulations you won!");
        } else {
            System.out.println("You Failed! :/");
        }
    }
}
