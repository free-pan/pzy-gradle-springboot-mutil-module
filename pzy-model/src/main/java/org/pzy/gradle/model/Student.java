package org.pzy.gradle.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生
 * @author pan
 * @date
 */
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = -1379816376370436501L;
    /**
     * 姓名
     */
    private String name;
}
