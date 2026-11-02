package org.example;

import java.util.List;
import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private int age;

    private final List<Member> members = new ArrayList<>();

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

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public Member findMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public void removeMember(Member member) {
        Member members = findMemberByName(member.getName());
    }
}
