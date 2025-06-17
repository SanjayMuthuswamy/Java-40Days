package Day8;

import java.util.ArrayList;
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class NameList {
    ArrayList<Person> people = new ArrayList<>();

    // CREATE
    public void addPerson(String name, int age) {
        Person p = new Person(name, age);
        people.add(p);
        System.out.println("Added: " + name);
    }

    // READ
    public void displayPeople() {
        if (people.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("People List:");
        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            System.out.println(i + " . " + p.name + " (" + p.age + " yrs)");
        }
    }

    // UPDATE by name
    public void updatePerson(String oldName, String newName, int newAge) {
        boolean updated = false;
        for (Person p : people) {
            if (p.name.equalsIgnoreCase(oldName)) {
                p.name = newName;
                p.age = newAge;
                System.out.println("Updated: " + oldName + " -> " + newName);
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("Person not found: " + oldName);
        }
    }

    // DELETE by index
    public void deletePersonByIndex(int index) {
        if (index >= 0 && index < people.size()) {
            Person removed = people.remove(index);
            System.out.println("Deleted: " + removed.name + " (" + removed.age + " yrs)");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // DELETE by name
    public void deletePersonByName(String name) {
        boolean removed = false;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).name.equalsIgnoreCase(name)) {
                Person p = people.remove(i);
                System.out.println("Deleted: " + p.name + " (" + p.age + " yrs)");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Person not found: " + name);
        }
    }

    // SEARCH
    public void searchPerson(String name) {
        boolean found = false;
        for (Person p : people) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Found Person: " + p.name + " (" + p.age + " yrs)");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Person Not Found: " + name);
        }
    }

    // REMOVE DUPLICATES
    public void duplicateCheck() {
        boolean duplicateFound = false;
        for (int i = 0; i < people.size(); i++) {
            Person p1 = people.get(i);
            for (int j = i + 1; j < people.size(); j++) {
                Person p2 = people.get(j);
                if (p1.name.equalsIgnoreCase(p2.name)) {
                    people.remove(j);
                    j--;
                    System.out.println("Duplicate found and removed: " + p2.name + " (" + p2.age + ")");
                    duplicateFound = true;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }
    }
}

public class arraycrud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameList list = new NameList();

        int choice;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Add Person");
            System.out.println("2. Display People");
            System.out.println("3. Update Person by Name");
            System.out.println("4. Delete Person by Index");
            System.out.println("5. Search Person");
            System.out.println("6. Exit");
            System.out.println("7. Check and Remove Duplicates");
            System.out.println("8. Delete Person by Name");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    list.addPerson(name, age);
                    break;

                case 2:
                    list.displayPeople();
                    break;

                case 3:
                    System.out.print("Enter existing name to update: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    list.updatePerson(oldName, newName, newAge);
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int dIndex = sc.nextInt();
                    list.deletePersonByIndex(dIndex);
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String sname = sc.nextLine();
                    list.searchPerson(sname);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                case 7:
                    list.duplicateCheck();
                    break;

                case 8:
                    System.out.print("Enter name to delete: ");
                    String delName = sc.nextLine();
                    list.deletePersonByName(delName);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
