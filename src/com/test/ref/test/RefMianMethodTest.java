package com.test.ref.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/7/1.
 */
public class RefMianMethodTest {
    public  static void  main (String [] args) {
        try {
            Class clazz = Class.forName("com.test.ref.entity.RefMainMethod");
            try {
                Method method = clazz.getMethod("main", String[].class);
                try {
                    method.invoke(null,(Object) new String [] {"a","av","vds","vs"});
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
