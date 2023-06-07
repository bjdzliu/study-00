package com.ce.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class dept implements Serializable {
    //table columes: DEPTNO | DNAME      | LOC
    private Integer DEPTNO;
    private String DNAME;
    private String LOC;

}
