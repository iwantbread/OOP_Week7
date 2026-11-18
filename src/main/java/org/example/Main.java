package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i != 5) {
            System.out.println("---Gym Membership Manager---\n1. Add Member\n2. Display All Members\n" +
                    "3. Search by ID\n4. Remove Member\n5. Exit\nEnter Choice: ");

            i = scanner.nextInt();
            scanner.nextLine();

            if (i == 1) {
                System.out.println("Enter Member ID: ");
                String memberID = scanner.nextLine();
                System.out.println("Enter Member Name: ");
                String name = scanner.nextLine();
                System.out.println("Enter Age: ");
                int age = scanner.nextInt();

                scanner.nextLine();

                if (age <= 0) {
                    System.out.println("Age cannot be less than 1");
                }
                else {
                    Member member = new Member(memberID, name, age);

                    members.add(member);

                    member.displayDetails();
                }
            }

            if (i == 2) {
                if (members.size() == 0) {
                    System.out.println("There are no gym members stored on the system yet");
                }
                else {
                    for (Member member:members) {
                        member.displayDetails();
                    }
                }

            }

            if (i == 3) {
                System.out.println("Enter Member ID: ");
                String memberID = scanner.nextLine();

                boolean found = false;

                for (Member member : members) {

                    if (member.getMemberId().equals(memberID)) {
                        member.displayDetails();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No member matches that data");
                }
            }

            if (i == 4) {
                System.out.println("Enter Member ID: ");
                String memberID = scanner.nextLine();

                boolean found = false;

                for (Member member : members) {

                    if (member.getMemberId().equals(memberID)) {
                        members.remove(member);
                        found = true;
                        System.out.println("Member has been removed");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No member matches that data");
                }

            }
        }
    }
}