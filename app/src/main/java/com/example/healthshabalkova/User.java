package com.example.healthshabalkova;

import java.util.Objects;

public class User {
    protected String name;
    protected int age;
    protected BPdata userBP;
    protected Vitals userVitals;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BPdata getUserBP() {
        return userBP;
    }

    public void setUserBP(BPdata userBP) {
        this.userBP = userBP;
    }

    public Vitals getUserVitals() {
        return userVitals;
    }

    public void setUserVitals(Vitals userVitals) {
        this.userVitals = userVitals;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
