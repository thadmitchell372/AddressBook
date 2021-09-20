package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Entries> book = new ArrayList<>();

    public static void main(String[] args) {
        String option;
        do {
            System.out.println("Choose from the following options.(Type 1-6)");
            System.out.println("1) Add an entry " + "\n" + "2) Remove an entry" + "\n" + "3) Search for a specific entry" + "\n" +
                    "4) Print Address Book" + "\n" + "5) Delete book" + "\n" + "6) Quit" + "\n" + ": ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    Entries newEntry = new Entries();

                    System.out.println("Please enter first name: ");
                    String answer = scanner.nextLine();
                    newEntry.setFirstName(answer);
                    System.out.println("Please enter last name: ");
                    String answer1 = scanner.nextLine();
                    newEntry.setLastName(answer1);
                    System.out.println("Please enter the phone number: ");
                    long answer2 = scanner.nextLong();
                    scanner.nextLine();
                    newEntry.setPhoneNumber(answer2);
                    System.out.println("Please enter the email address: ");
                    String answer3 = scanner.nextLine();
                    newEntry.setEmail(answer3);
                    book.add(newEntry);
                    break;
                case "2":
                    System.out.println("Please enter the email address of the contact you would like to remove: ");
                    String email = scanner.nextLine();
                    for (int i=0;i<book.size();i++) {
                        if (book.get(i).getEmail().equals(email)) {
                            book.remove(i);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Would you like to search by 1) first name, 2) last name, 3) phone number, or 4) email?: ");
                    String search = scanner.nextLine();

                    if (search.equals("first name") || search.equals("1")){
                        System.out.println("What does the first name start with?: ");
                        String firstN = scanner.nextLine();
                        for (int j=0;j<book.size();j++){
                            if(book.get(j).getFirstName().startsWith(firstN)){
                                System.out.println(book.get(j));
                            }
//                            else {
//                                System.out.println("Sorry no matches!");
//                            }
                        }
                    }
                    if (search.equals("last name") || search.equals("2")){
                        System.out.println("What does the last name start with?: ");
                        String lastN = scanner.nextLine();
                        for (int j=0;j<book.size();j++){
                            if(book.get(j).getLastName().startsWith(lastN)) {
                                System.out.println(book.get(j));
                            }
//                            else {
//                                System.out.println("Sorry no matches!");
//                            }
                        }
                    }

                    if (search.equals("phone number")){
                        System.out.println("What is the phone number?: ");

                        long phone = scanner.nextLong();
                        for (int j=0;j<book.size();j++){
                            if(book.get(j).getPhoneNumber() == (phone))
                                System.out.println(book.get(j));
                        }
                    }
                    if (search.equals("email")){
                        System.out.println("What does the email start with?: ");

                        String emailA = scanner.nextLine();
                        for (int j=0;j<book.size();j++){
                            if(book.get(j).getEmail().startsWith(emailA)){
                                System.out.println(book.get(j));
                            }
//                            else {
//                                System.out.println("Sorry no matches!");
//                            }
                        }
                    }
                    break;
                case "4":
                    for (Object add : book) {
                        System.out.println(add);
                    }
                    break;
                case "5":
                    book.clear();

                    System.out.println("Address book cleared!");
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Incorrect input, please try again");
            }
        }while (!option.equals("6"));

    }
    }

