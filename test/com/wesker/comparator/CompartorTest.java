package com.wesker.comparator;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Compartor使用用例
 * @author MR.ZHANG
 * @create 2019-03-04 9:55
 */

public class CompartorTest {
    @Test
    public void test() {
        Random random = new Random();
        List<Student> students = new ArrayList<>();
        Stream.iterate(0, x -> x + 1 )
                .limit(10)
                .forEach(y -> {
                    Student student = new Student();
                    student.setName("zhangsan");
                    student.setAge(random.nextInt(10));
                    student.setClassNumber(random.nextInt(100));
                    students.add(student);
                });
        List<Student> studentSortList = students.stream()
                .sorted(Comparator.comparingInt(Student::getAge)
                        .thenComparing(Student::getClassNumber))
                .collect(Collectors.toList());

        //System.out.println(students);
        //Collections.sort(students, new StudentComparator());
        studentSortList.forEach( x -> System.out.println(x));

    }
}
