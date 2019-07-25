package com.young.ssm.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Auther:dep
 * @Date: 2019/7/17 17:21
 * @Description:
 */
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String nickname;
    private String password;
    private String icon;
    private String realName;
    private String duties;
    private Integer accountType;
    private String invertCode;
    private Integer currentStep;
    private Long companyUserId;
    private Long audioUser;
    private String audioSuggest;
    private String contractStart;
    private String contractEnd;
    private String prefix;
    private Long submitAudioTime;
    private Long audioTime;
    private String lastLoginDate;
    private Integer viewScopeType=1;
    private Date viewScopeDate;
    private Integer guidelines;
    private Integer iconType;
    private String businessPw;
    private String enterpriseName;
    private Integer hasOpenEletricContract;
    private Long frequency;
    private String freInDate;

    private UserDepartment userDepartment;

    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public UserDepartment getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(UserDepartment userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getInvertCode() {
        return invertCode;
    }

    public void setInvertCode(String invertCode) {
        this.invertCode = invertCode;
    }

    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }

    public Long getCompanyUserId() {
        return companyUserId;
    }

    public void setCompanyUserId(Long companyUserId) {
        this.companyUserId = companyUserId;
    }

    public Long getAudioUser() {
        return audioUser;
    }

    public void setAudioUser(Long audioUser) {
        this.audioUser = audioUser;
    }

    public String getAudioSuggest() {
        return audioSuggest;
    }

    public void setAudioSuggest(String audioSuggest) {
        this.audioSuggest = audioSuggest;
    }

    public String getContractStart() {
        return contractStart;
    }

    public void setContractStart(String contractStart) {
        this.contractStart = contractStart;
    }

    public String getContractEnd() {
        return contractEnd;
    }

    public void setContractEnd(String contractEnd) {
        this.contractEnd = contractEnd;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Long getSubmitAudioTime() {
        return submitAudioTime;
    }

    public void setSubmitAudioTime(Long submitAudioTime) {
        this.submitAudioTime = submitAudioTime;
    }

    public Long getAudioTime() {
        return audioTime;
    }

    public void setAudioTime(Long audioTime) {
        this.audioTime = audioTime;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getViewScopeType() {
        return viewScopeType;
    }

    public void setViewScopeType(Integer viewScopeType) {
        this.viewScopeType = viewScopeType;
    }

    public Date getViewScopeDate() {
        return viewScopeDate;
    }

    public void setViewScopeDate(Date viewScopeDate) {
        this.viewScopeDate = viewScopeDate;
    }

    public Integer getGuidelines() {
        return guidelines;
    }

    public void setGuidelines(Integer guidelines) {
        this.guidelines = guidelines;
    }

    public Integer getIconType() {
        return iconType;
    }

    public void setIconType(Integer iconType) {
        this.iconType = iconType;
    }

    public String getBusinessPw() {
        return businessPw;
    }

    public void setBusinessPw(String businessPw) {
        this.businessPw = businessPw;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Integer getHasOpenEletricContract() {
        return hasOpenEletricContract;
    }

    public void setHasOpenEletricContract(Integer hasOpenEletricContract) {
        this.hasOpenEletricContract = hasOpenEletricContract;
    }

    public Long getFrequency() {
        return frequency;
    }

    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }

    public String getFreInDate() {
        return freInDate;
    }

    public void setFreInDate(String freInDate) {
        this.freInDate = freInDate;
    }
}
