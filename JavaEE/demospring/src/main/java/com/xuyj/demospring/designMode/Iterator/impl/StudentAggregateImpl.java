package com.xuyj.demospring.designMode.Iterator.impl;



import com.xuyj.demospring.designMode.Iterator.StudentAggregate;
import com.xuyj.demospring.designMode.Iterator.StudentIterator;
import com.xuyj.demospring.designMode.Iterator.pojo.Student;

import java.util.ArrayList;

/**
 * 维护集合
 */
public class StudentAggregateImpl implements StudentAggregate {
    /**
     * 学生集合
     */
    private ArrayList<Student> list;

    public StudentAggregateImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(this.list);
    }
}

