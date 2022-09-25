import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        persons.add(new Person("rolle", "12313", 23));
        persons.add(new Person("sven", "121235", 32));
        persons.add(new Person("laban", "5223", 53));
        persons.add(new Person("fia", "15133", 21));
        menu();
        System.out.println("Adieu!");


    }
    public static void menu () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    What do you want to do?
                    1. Add a person
                    2. print a list of all persons
                    3. quit
                    4. search for a person""");
            int choice = scanner.nextInt();
            if (choice == 1) {
                addPersonToPersons();
            }
            if (choice == 2) {
                printListOfPersons();
            }
            if (choice == 3) {
                break;
            }
            if (choice == 4) {
                searchForPerson();
            }
        }
    }
    public static void searchForPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type in the persons name:");
        String nameInput = scanner.nextLine();
        //Boolean done;
        for(Person person : persons) {
            if(person.getName().equals(nameInput)) {
                System.out.println(person.name + ", age:" + person.age + ", nr:" + person.phone);

                if(person.isHired == false) {        

                    System.out.println("do you want to hire " + person.name + "? y/n");
                    String choice = scanner.nextLine();
                    if(choice.equals("y")) {
                        //done = true;
                        person.isHired = true;
                        break;
                    }
                    else break;

                }
                else {
                    System.out.println("do you want to fire " + person.name + "? y/n");
                    String choice = scanner.nextLine();
                    if (choice.equals("y"))
                        person.isHired = false;
                    else break;
                }
            }


        }
        System.out.println("no person with that name was found");
    }

    public static void printListOfPersons () {
        for(Person person : persons) {
            person.personToString();
        }
    }

    public static void addPersonToPersons () {
        System.out.println("type in name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("type in phone-number");
        String phone = scanner.nextLine();
        System.out.println("type in age");
        int age = scanner.nextInt();

        persons.add(new Person(name, phone, age));
    }




}