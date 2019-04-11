package com.wesker.comparator;

/**
 * @author MR.ZHANG
 * @create 2019-03-04 9:52
 */
public class Student {

    private int age;
    private String name;
    /**
     *  座位号
     */
    private long classNumber;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(long classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", classNumber=" + classNumber +
                '}';
    }
}
