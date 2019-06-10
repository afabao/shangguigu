package com.afabao.shangguigu.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: 啊发包
 * @Date: 2019/06/10 2019-06-10
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

}
