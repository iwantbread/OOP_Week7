package org.example;

public class Main {}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

        int i = Integer.parseInt(System.console().readLine());

        if (i == 1) {
            System.out.println("Enter Member ID: ");
            int memberID = Integer.parseInt(System.console().readLine());
            System.out.println("Enter Member Name: ");
            String name = System.console().readLine();
            System.out.println("Enter Age: ");
            int age = Integer.parseInt(System.console().readLine());

            Member.addMember(memberID, name, age);

            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            int i = Integer.parseInt(System.console().readLine());
        }

        if (i == 2) {
            int j;
            for (j = 0; j < member.size(); j++) {
                members.get(j).System.out.println(members);
            }

            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            int i = Integer.parseInt(System.console().readLine());
        }
        if (i == 3) {
            System.out.println("Enter Member ID: ");
            int memberID = Integer.parseInt(System.console().readLine());

            return members.findMemberById(memberID);


            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            int i = Integer.parseInt(System.console().readLine());
        }

        if(i = 4) {



            System.out.println("---Gym Membership Manager---\n1. Add Member\n2.Display All Members\n" +
                    "Search by ID\nRemove Member\n5. Exit\nEnter Choice: ");

            int i = Integer.parseInt(System.console().readLine());
        }

        if(i == 5) {

        }
    }
}