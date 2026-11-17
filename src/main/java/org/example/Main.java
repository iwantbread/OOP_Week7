package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*public int i;

        for (i = 0;i >= 5 || i <= 0) {
            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit");
            i = System.in.read(int i);

            if (i == 1) {

            }
            */
        System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

        int i = scanner.nextInt();
        scanner.nextLine();

        if (i == 1) {
            System.out.println("Enter Member ID: ");
            String memberID = scanner.nextLine();
            System.out.println("Enter Member Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Age: ");
            int age = scanner.nextInt();

            scanner.nextLine();

            Member member = new Member(memberID, name, age);

            member.displayDetails();

            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            i = scanner.nextInt();
        }
        /*
        if (i == 2) {
            int j;
            for (j = 0; j < member.size(); j++) {
                members.get(j).System.out.println(members);
            }

            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            i = scanner.nextInt();
            scanner.nextLine();
        }

        if (i == 3) {
            System.out.println("Enter Member ID: ");
            int memberID = Integer.parseInt(System.console().readLine());

            return members.findMemberById(memberID);


            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            i = scanner.nextInt();
            scanner.nextLine();
        }

        if(i = 4) {



            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            i = scanner.nextInt();
            scanner.nextLine();
        }

        if(i == 5) {

        }

        */
    }
}