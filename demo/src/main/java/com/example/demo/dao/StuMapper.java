package com.example.demo.dao;

import com.example.demo.entity.Stu;

public interface StuMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}