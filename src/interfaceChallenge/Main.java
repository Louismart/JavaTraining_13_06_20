package interfaceChallenge;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Player tim = new Player("Tim", 10, 15, "Sword");
        Monster jim = new Monster("Jim", 8, 12, "Knife");
        System.out.println(tim.toString());
        System.out.println(jim.toString());
        saveObject(tim);
        saveObject(jim);
        tim.setHitPoints(8);
        jim.setStrenght(45);
        System.out.println(tim);
        System.out.println(jim);
        tim.setWeapon("Stormbringer");
        jim.setWeapon("Pistol");
        saveObject(tim);
        saveObject(jim);

        loadObject(tim);
        loadObject(jim);

        System.out.println(tim);
        System.out.println(jim);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }

        }
        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
    }

    public static void loadObject(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




}
