package com.xuyj.demospring.designMode.Iterator;


import com.xuyj.demospring.designMode.Iterator.pojo.Student;

public interface StudentIterator {
    /**
     * 获取下一个学生对象
     * @return
     */
    Student nextStudent();

    /**
     * 是否是最后一个
     * @return
     */
    boolean isLast();
}
