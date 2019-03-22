package com.owen.rest_demo.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @autuor
 * @Date 2019-03-22 10:20
 */
@Data
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    private Integer active;
    private Date lastLoginTime;
    private Date createTime;
    private Date updateTime;
}
