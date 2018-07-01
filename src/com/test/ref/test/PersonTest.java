package com.test.ref.test;

import com.test.ref.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2018/7/1.
 */
public class PersonTest {
    public static  void  main(String [] args) throws ClassNotFoundException {
       Class clazz =  Class.forName("com.test.ref.entity.Person");
        System.out.println("***********获取所有公有的字段*************");
        Field [] fields = clazz.getFields();
        for (Field field :fields) {
            System.out.println(field);
        }
        System.out.println("*************获取所有的字段(包括私有、受保护、默认的)*******************");
        Field [] fields1 = clazz.getDeclaredFields();
        for( Field field : fields1) {
            System.out.println(field);
        }
        System.out.println("**************获取公有字段**并调用******************");
        try {
            Field field = clazz.getField("name");
            System.out.println(field);
            try {
                Object object = clazz.getConstructor().newInstance();
                field.set(object,"123131agag354sdfag");
                Person person = (Person)object;
                System.out.println(person.getName());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("*********获取私有字段****并调用************");
        try {
            Field field = clazz.getDeclaredField("phone");
            System.out.println(field);
            try {
                Object object  = clazz.getConstructor().newInstance();
                field.setAccessible(true);
                field.set(object,"123456489");
                Person person = (Person)object;
                System.out.println(person.getPhone());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
