package com.xuyj.demospring.designMode.Iterator.impl;


import com.xuyj.demospring.designMode.Iterator.StudentIterator;
import com.xuyj.demospring.designMode.Iterator.pojo.Student;

import java.util.ArrayList;

public class StudentIteratorImpl implements StudentIterator {
    /**
     * 学生集合, 通过构造函数注入
     */
    private ArrayList<Student> list;

    /**
     * 当前处理的集合索引
     */
    private int position;

    /**
     * 当前处理的学生对象
     */
    private Student student;

    public StudentIteratorImpl(ArrayList<Student> list) {
        this.list = list;
    }

    @Override
    public Student nextStudent() {
        System.out.println("返回 " + position + " 位置的学生对象 : " + student);
        student = list.get(position);
        position++;
        return student;
    }

    @Override
    public boolean isLast() {
        return position < list.size() ? false : true;
    }
}
