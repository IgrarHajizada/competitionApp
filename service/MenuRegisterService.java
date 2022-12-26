package projects.competitionApp.service;

import projects.competitionApp.bean.Config;
import projects.competitionApp.bean.Person;


import java.util.Scanner;

public class MenuRegisterService implements MenuInterface {

    public Person[] register() {

        System.out.println("How many people will take part in?\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
         Config.registeredPerson = scanner.nextInt();

        Config.people = new Person[Config.registeredPerson];
        String name;
        String surname;

        for (int i = 0; i < Config.people.length; i++) {
            scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.print("Enter surname: ");
            surname = scanner.nextLine();

            Person person = new Person(name, surname);
            Config.people[i] = person;
        }

        System.out.println("Competitors have been registered successfully!\n");
        return Config.people;


    }


    @Override
    public void process() {
        Person[] personArr = register();
        for (int i = 0; i < personArr.length; i++) {
            System.out.println(personArr[i].toString());
        }
    }
}
