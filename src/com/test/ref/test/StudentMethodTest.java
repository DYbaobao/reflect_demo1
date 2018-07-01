package com.test.ref.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/7/1.
 */
public class StudentMethodTest {
    public  static  void  main (String [] args) {
        try {
            Class clazz = Class.forName("com.test.ref.entity.StudentMethod");
            System.out.println("***************获取所有的”公有“方法*******************");
            Method []  methods = clazz.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("***************获取所有的方法，包括私有的*******************");
            Method [] methods1 = clazz.getDeclaredMethods();
            for (Method method : methods1) {
                 System.out.println(method);
            }
            System.out.println("***************获取公有的show1()方法*******************");
            try {
                Method method = clazz.getMethod("show1", String.class);
                System.out.println(method);
                try {
                    Object object = clazz.getConstructor().newInstance();
                    method.invoke(object,"ijijijijij");
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            System.out.println("***************获取私有的show4()方法******************");
            try {
                Method method = clazz.getDeclaredMethod("show4", int.class);
                System.out.println(method);
                try {
                    Object object = clazz.getConstructor().newInstance();
                    method.setAccessible(true);
                    Object re = method.invoke(object,1313);
                    System.out.println("返回值 ：" +re);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
