package com.xuyj.demospring.designMode.Iterator;


import com.xuyj.demospring.designMode.Iterator.pojo.Student;

/**
 * 集合的管理类
 */
public interface StudentAggregate {
    /**
     * 增加学生
     * @param student
     */
    void addStudent(Student student);

    /**
     * 删除学生
     */
    void removeStudent(Student student);

    /**
     * 获取学生集合的迭代器
     * @return
     */
    StudentIterator getStudentIterator();
}
