package com.afabao.shangguigu.dao;

import com.afabao.shangguigu.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: 啊发包
 * @Date: 2019/06/10 2019-06-10
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
