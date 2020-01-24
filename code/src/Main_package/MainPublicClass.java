package Main_package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPublicClass {

    public static void main(String[] args) {
        //============================  Variable Declaration START ==============================
        // No edit required var
        Scanner input = new Scanner(System.in);
        String choice = null;
        boolean run = true;
        boolean run1 = true;

        // Var that may need to be edited later
        String treeChoice;
        int treeCounter = 0, mango = 0, mahogony = 0, neem = 0, jakfruit = 0, wood = 0;
        int plantOrView = 0;

        // Array of String for Tree names
        String[] mango_tree = new String[50];
        String[] neem_tree = new String[50];
        String[] mahogony_tree = new String[50];
        String[] jakfruit_tree = new String[50];
        String[] wood_tree = new String[50];

        Tree[] obj1 = new Tree[50]; // Stroing all trees here

        // Try Catch loop variable
        boolean try1 = true;

        //============================  Variable Declaration END ==============================
        System.out.println("**Welcome to Tree plantation prgram**");
        System.out.println("----------------------------------");
        System.out.println("Our available tree names given below:");
        System.out.println("Mango | Mahogony | Neem | Jakfruit | WoodTree");

        // Part - 1
        //////////////////////////////////////////////////////////
        // Asking for planting tree or Want View the characteristics of tree
        while (try1 == true) {
            // Try1
            try {
                System.out.println("** Press 1 to plant a tree || 2 to see a specific Tree CHARACTERISTICS | 9 to exit the program **");
                plantOrView = input.nextInt();

                if (plantOrView == 1) {
                    do {
                        System.out.println("Do you want to plant a tree? (yes / no) ");
                        choice = input.next();
                        choice = choice.toUpperCase();
                        if (choice.equals("YES")) {
                            run = true;
                            try1 = false;
                        } else if (choice.toUpperCase().equals("NO")) {
                            run = false;
                            try1 = false;
                        } else {
                            System.out.println("invalid entry!! type > YES or NO");
                        }
                    } while (try1);
                    try1 = false;
                } else if (plantOrView == 2) {
                    do {
                        System.out.println("Enter tree name that you want to see the characteristics for: ");
                        System.out.println("Mango | Mahogony | Neem | Jakfruit | WoodTree");
                        treeChoice = input.next();
                        // Print Tree Characteristics
                        switch (treeChoice.toUpperCase()) {
                            case "MANGO":
                                Tree_Characteristics mangoCharacteristics = new Tree_Characteristics();
                                mangoCharacteristics.mango_characteristics();
                                break;
                            case "MAHOGONY":
                                Tree_Characteristics mahogonyCharacteristics = new Tree_Characteristics();
                                mahogonyCharacteristics.mahogony_characteristics();
                                break;
                            case "NEEM":
                                Tree_Characteristics neemCharacteristics = new Tree_Characteristics();
                                neemCharacteristics.neem_characteristics();
                                break;
                            case "JACKFRUIT":
                                Tree_Characteristics jackfruitCharacteristics = new Tree_Characteristics();
                                jackfruitCharacteristics.jackfruit_characteristics();
                                break;
                            case "WOODTREE":
                                Tree_Characteristics woodCharacteristics = new Tree_Characteristics();
                                woodCharacteristics.wood_characteristics();
                                break;
                            default:
                                System.out.println("Invalid entry!!");
                        }
                        System.out.println("Do you want to See more tree characteristics? type > YES or NO");
                        treeChoice = input.next();
                        treeChoice = treeChoice.toUpperCase();
                        if (!treeChoice.equals("YES") && !treeChoice.equals("NO")) {
                            System.out.println("Invalid Entry!! Try again!! ");
                        }
                    } while (treeChoice.equals("YES"));
                    //  try1 = false;
                } else if (plantOrView == 9) {
                    try1 = false;
                    run = false;
                    System.out.println("See you next time... :( ");
                } else {
                    System.out.println("Invalid entry try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("WARING!!: Sorry, You have error in: " + e);
                String dump_input = input.nextLine();
                continue;
            }
        }

        // Part -2 
        ////////////////////////////////////////////
        // Taking tree input
        while (run) {
            //System.out.println("");

            //Taking tree input if user wants to plant tree
            System.out.println("Welcome to Tree Plantation Menu: ");

            String choice1;
            while (run1) {
                System.out.println("****");
                System.out.println("Which tree do you want to plant?");

                boolean treeName = true;
                while (treeName) {
                    System.out.println("Mango | Mahogony | Neem | Jakfruit | Woodtree");
                    System.out.print("Type tree name to plant: ");
                    treeChoice = input.next();
                    switch (treeChoice.toUpperCase()) {
                        case "MANGO":
                            Mango tempMango = new Mango();
                            obj1[treeCounter++] = tempMango;
                            obj1[treeCounter - 1].enterInfo();
                            tempMango.mangoInfo();

                            treeName = false;
                            break;
                        case "MAHOGONY":
                            Mahogony tempMahogony = new Mahogony();
                            obj1[treeCounter++] = tempMahogony;
                            obj1[treeCounter - 1].enterInfo();
                            tempMahogony.mahogonyInfo();

                            treeName = false;
                            break;
                        case "NEEM":
                            Neem tempNeem = new Neem();
                            obj1[treeCounter++] = tempNeem;
                            obj1[treeCounter - 1].enterInfo();
                            tempNeem.neemInfo();

                            treeName = false;
                            break;
                        case "JAKFRUIT":
                            Jakfruit tempJakfruit = new Jakfruit();
                            obj1[treeCounter++] = tempJakfruit;
                            obj1[treeCounter - 1].enterInfo();
                            tempJakfruit.jakfruitInfo();

                            treeName = false;
                            break;
                        case "WOODTREE":
                            WoodTree tempWoodTree = new WoodTree();
                            obj1[treeCounter++] = tempWoodTree;
                            obj1[treeCounter - 1].enterInfo();
                            tempWoodTree.woodInfo();

                            treeName = false;
                            break;
                        default:
                            System.out.println("Invalid entry try again!");
                        //String dump_here = input.next();
                    }
                }
                System.out.println("Your desireable tree has been created. Catagory for this tree is: " + ">>" + obj1[treeCounter - 1].userTreeName);
                run1 = false;
                //choice = "NO";
                // Asking for more tree
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Do you want to plant more tree? | \nTo plant more, input> YES\nInput anything to complete planting trees...");
                System.out.print("Your input: ");
                choice1 = input.next();
                choice1 = choice1.toUpperCase();
                if (choice1.equals("YES")) {
                    run1 = true;
                }
            }

            // Part- 3
            //////////////////////////////////////////
            // Priting All trees after Planting trees
            System.out.println("\n~~~\nTotal trees you have chosen: ");
            System.out.println("===");
            // Counting total trees
            for (int i = 0; i < treeCounter; i++) {
                if (obj1[i].userTreeName.contains("Mango")) {
                    mango_tree[mango] = obj1[i].userTreeName;
                    mango++;
                } else if (obj1[i].userTreeName.contains("Mahogony")) {
                    mahogony_tree[mahogony] = obj1[i].userTreeName;
                    mahogony++;
                } else if (obj1[i].userTreeName.contains("Neem")) {
                    neem_tree[neem] = obj1[i].userTreeName;
                    neem++;
                } else if (obj1[i].userTreeName.contains("Jakfruit")) {
                    jakfruit_tree[jakfruit] = obj1[i].userTreeName;
                    jakfruit++;
                } else if (obj1[i].userTreeName.contains("Wood_Tree")) {
                    wood_tree[wood] = obj1[i].userTreeName;
                    wood++;
                }

            }
            // Total tree number print
            System.out.println("Mango Tree: " + mango);
            System.out.println("Mahogony Tree: " + mahogony);
            System.out.println("Neem Trees: " + neem);
            System.out.println("Jakfruit Trees: " + jakfruit);
            System.out.println("Wood Trees: " + wood);

            System.out.println("\n~~~\nTree ID in details: ");
            // Trees names printing in details
            System.out.print("Mango Tree    : ");
            for (String temp : mango_tree) {
                if (temp != null) {
                    System.out.print(temp + ", ");
                }
            }
            System.out.print("\nMahogony Tree : ");
            for (String temp : mahogony_tree) {
                if (temp != null) {
                    System.out.print(temp + ", ");
                }
            }
            System.out.print("\nNeem Tree     : ");
            for (String temp : neem_tree) {
                if (temp != null) {
                    System.out.print(temp + ", ");
                }
            }
            System.out.print("\nJakfruit Tree : ");
            for (String temp : jakfruit_tree) {
                if (temp != null) {
                    System.out.print(temp + ", ");
                }
            }
            System.out.print("\nWood Tree     : ");
            for (String temp : wood_tree) {
                if (temp != null) {
                    System.out.print(temp + ", ");
                }
            }
            System.out.println("\n\n");
            run = false;
          
        } // While loop of run END


    } // Main psvm
}
