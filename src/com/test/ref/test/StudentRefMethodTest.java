package com.test.ref.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2018/7/1.
 */
public class StudentRefMethodTest {
    public static void main(String[] args) {
        try {
            Class clazz = null;

                clazz = Class.forName("com.test.ref.entity.Student");

            System.out.println("所有的公有的方法：********************");
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }

            System.out.println("所有的方法************");
            Constructor[] constructors1 = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors1) {
                System.out.println(constructor);
            }

            System.out.println("**********获取公有、无参的构造方法****************");

            try {
                Constructor constructor = null;
                try {
                    constructor = clazz.getConstructor(null);
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }

                Object object = constructor.newInstance();
                System.out.println("object:" + object);
                System.out.println("******************获取私有构造方法，并调用*******************************");
                try {
                    constructor = clazz.getDeclaredConstructor(int.class);
                    System.out.println("constructor" +constructor );
                    constructor.setAccessible(true);
                    object = constructor.newInstance(26);

                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }




        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}