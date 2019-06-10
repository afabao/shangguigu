package com.afabao.shangguigu.service;

import com.afabao.shangguigu.entities.Dept;

import java.util.List;

/**
 * @author: 啊发包
 * @Date: 2019/06/10 2019-06-10
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
