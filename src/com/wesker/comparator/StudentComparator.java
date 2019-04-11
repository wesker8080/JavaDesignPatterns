package com.wesker.comparator;

import java.util.Comparator;

/**
 * 学生比较器
 *
 * @author MR.ZHANG
 * @create 2019-03-04 9:59
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() != o2.getAge()) {
            return o1.getAge() > o2.getAge() ? 1 : -1;
        }
        if (o1.getClassNumber() != o2.getClassNumber()) {
            return o1.getClassNumber() > o2.getClassNumber() ? 1 : -1;
        }
        return 0;
    }
}
