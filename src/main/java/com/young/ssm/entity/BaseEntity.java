package com.young.ssm.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther:dep
 * @Date: 2019/7/18 09:54
 * @Description: 所有实体类的 基础类
 */
public class BaseEntity  {
    /**
     * 主键Id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 创建人
     */
    private Long createUser;
    /**
     * 修改时间
     */
    private  Long modefyTime;
    /**
     * 修改人
     */
    private Long modefyUser;
    /**
     * 修改描述
     */
    private String modefyDescription;

    /**
     * version 版本号 用于数据库的乐观锁
     */
    @Column(length = 11 , columnDefinition = "0")
    private Integer version;
    /**
     * 数据是否有效的状态 1有效 0 无效
     */
    @Column(length = 11 , columnDefinition = "0")
    private Integer status;

    /**
     * 空参构造
     */
    public BaseEntity() {
    }

    /**
     * 有参构造
     * @param id
     * @param createTime
     * @param createUser
     * @param modefyTime
     * @param modefyUser
     * @param modefyDescription
     * @param version
     * @param status
     */
    public BaseEntity(Long id, Long createTime, Long createUser, Long modefyTime, Long modefyUser, String modefyDescription, Integer version, Integer status) {
        this.id = id;
        this.createTime = createTime;
        this.createUser = createUser;
        this.modefyTime = modefyTime;
        this.modefyUser = modefyUser;
        this.modefyDescription = modefyDescription;
        this.version = version;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getModefyTime() {
        return modefyTime;
    }

    public void setModefyTime(Long modefyTime) {
        this.modefyTime = modefyTime;
    }

    public Long getModefyUser() {
        return modefyUser;
    }

    public void setModefyUser(Long modefyUser) {
        this.modefyUser = modefyUser;
    }

    public String getModefyDescription() {
        return modefyDescription;
    }

    public void setModefyDescription(String modefyDescription) {
        this.modefyDescription = modefyDescription;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setBeforeInsert(){

    }

}
