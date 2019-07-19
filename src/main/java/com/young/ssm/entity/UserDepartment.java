package com.young.ssm.entity;

/**
 * @Auther:dep
 * @Date: 2019/7/18 10:18
 * @Description:
 */
public class UserDepartment extends  BaseEntity {
    private Long userId;
    private Long departmentId;

    private Department department;

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
