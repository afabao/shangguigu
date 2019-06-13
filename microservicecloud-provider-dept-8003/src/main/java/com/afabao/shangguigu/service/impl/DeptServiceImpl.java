package com.afabao.shangguigu.service.impl;

import com.afabao.shangguigu.dao.DeptDao;
import com.afabao.shangguigu.entities.Dept;
import com.afabao.shangguigu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 啊发包
 * @Date: 2019/06/10 2019-06-10
 */

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
