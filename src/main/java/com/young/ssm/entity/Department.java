package com.young.ssm.entity;

/**
 * @Auther:dep
 * @Date: 2019/7/18 10:16
 * @Description:
 */
public class Department extends BaseEntity {

    private String departmentName;
    private Long parentId;
    private Integer level;
    private Long companyUserId;
    private Integer displaySeq;
    private Integer islogisticsBlackList;
    private Integer canPublishLogistics;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(Long companyUserId) {
        this.companyUserId = companyUserId;
    }

    public Integer getDisplaySeq() {
        return displaySeq;
    }

    public void setDisplaySeq(Integer displaySeq) {
        this.displaySeq = displaySeq;
    }

    public Integer getIslogisticsBlackList() {
        return islogisticsBlackList;
    }

    public void setIslogisticsBlackList(Integer islogisticsBlackList) {
        this.islogisticsBlackList = islogisticsBlackList;
    }

    public Integer getCanPublishLogistics() {
        return canPublishLogistics;
    }

    public void setCanPublishLogistics(Integer canPublishLogistics) {
        this.canPublishLogistics = canPublishLogistics;
    }
}
