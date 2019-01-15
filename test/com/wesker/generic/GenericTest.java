package com.wesker.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型extends和super和区别
 * extends 是GetFirst，适用于消费集合元素为主的场景
 * super 是PutFirst，适用于生产集合元素为主的场景
 * extends T 只能赋值T或T子类的集合
 * super T 只能赋值T或T父类的集合
 * @author MR.ZHANG
 * @create 2019-01-15 9:42
 */
public class GenericTest {
    public static void main(String[] args){

        // 声明集合
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Garfield> garfields = new ArrayList<>();

        animals.add(new Animal());
        cats.add(new Cat());
        garfields.add(new Garfield());

        // 下行编译报错，只能赋值Cat或Cat子类的集合
//        List<? extends Cat> extendsCatFromAnimal = animals;
        List<? super Cat> superCatFromAnimal = animals;

        List<? extends Cat> extendsCatFromCat = cats;
        List<? super Cat> superCatFromCat = cats;
        List<? extends Cat> extendsCatFromGarfield = garfields;
        // 下行编译报错，只能赋值Cat或Cat父类的集合
//        List<? super Cat> superCatFromGarfield = garfields;

        // 测试add方法
        // 下面三行均报错，因为除了null外，任何元素都不能被添加进<? extends T>集合内
//        extendsCatFromCat.add(new Animal());
//        extendsCatFromCat.add(new Cat());
//        extendsCatFromCat.add(new Garfield());
        // 下面一行报错，只能添加Cat或Cat子类的集合
//        superCatFromCat.add(new Animal());
        superCatFromCat.add(new Cat());
        superCatFromCat.add(new Garfield());

        // 测试get方法
        // 所有的super操作都能够返回元素，但是泛型丢失，只能返回Object对象

        // 以下extends操作能够返回元素
        Object catExtends1 = extendsCatFromCat.get(0);
        Cat catExtends2 = extendsCatFromCat.get(0);
        // 下行编译报错。虽然Cat集合从Garfield赋值而来，但是类型擦除后，是不知道的
//        Garfield garfield1 = extendsCatFromGarfield.get(0);
    }
}
