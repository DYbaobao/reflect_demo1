package com.test.ref.test;

import com.test.ref.entity.Student;

/**
 * Created by Administrator on 2018/7/1.
 */
public class StudentRefTest {
    public static void  main (String [] args){
        /**
         * 1.通过对象的getClass()
         */
        Student student =  new Student();
        Class stu =  student.getClass();
        System.out.println("getCanonicalName() " +stu.getCanonicalName());
        System.out.println("getName() " +stu.getName() );

        /**
         * 2.通过.class 获取
         */
        Class stu1 = Student.class;
        System.out.println(stu1==stu);

        /**
         * 3.Class.forName()
         */
        try {
            Class stu2 = Class.forName("com.test.ref.entity.Student");
            System.out.println(stu2 == stu);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
