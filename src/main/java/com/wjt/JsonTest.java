package com.wjt;


import com.alibaba.fastjson.JSON;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @creat 2022--27 12:59
 */
public class JsonTest {

    public Date getDate() {
        Date date = new Date();
        return date;
    }

    @Test
    public void testObjectToJSON() {
        //java对象转成json类型的字符串
        Student student = new Student();
        student.setAge(20);
        student.setId(1);
        student.setName("zhangsan");
        student.setBrithday(getDate());
        student.setEmail("sadasda");

        //student对象转到json格式
        String s = JSON.toJSONString(student);
        System.out.println(s);

    }
    @Test
    public void testListToJSON() {
        //创建一个list集合存储student对象
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student();
        student1.setAge(20);
        student1.setId(1);
        student1.setName("zhangsan");
        student1.setBrithday(getDate());
        student1.setEmail("sadasda");

        Student student2 = new Student();
        student2.setAge(24);
        student2.setId(2);
        student2.setName("lisi");
        student2.setBrithday(getDate());
        student2.setEmail("116@qq.com");

        //student对象存储在list集合中
        students.add(student1);
        students.add(student2);

        //list集合序列化为json格式字符串
        String s = JSON.toJSONString(students);
        System.out.println(s);
    }

}
