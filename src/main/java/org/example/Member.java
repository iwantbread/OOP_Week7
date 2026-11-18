package org.example;

public class Member {
    private String memberId;
    private String name;
    private int age;

    public Member(String memberId, String name, int age) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayDetails() {
        System.out.println("memberId: " + memberId);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
