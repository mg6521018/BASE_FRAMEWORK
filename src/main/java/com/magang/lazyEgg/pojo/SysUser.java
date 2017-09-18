package com.magang.lazyEgg.pojo;

public class SysUser {
    private String id;

    private String userName;

    private String account;

    private String password;

    private String email;

    private Integer age;

    private Integer status;

    private String autograph;

    private String templateHtml;

    private String imgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getTemplateHtml() {
        return templateHtml;
    }

    public void setTemplateHtml(String templateHtml) {
        this.templateHtml = templateHtml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUser sysUser = (SysUser) o;

        if (id != null ? !id.equals(sysUser.id) : sysUser.id != null) return false;
        if (userName != null ? !userName.equals(sysUser.userName) : sysUser.userName != null) return false;
        if (account != null ? !account.equals(sysUser.account) : sysUser.account != null) return false;
        if (password != null ? !password.equals(sysUser.password) : sysUser.password != null) return false;
        if (email != null ? !email.equals(sysUser.email) : sysUser.email != null) return false;
        if (age != null ? !age.equals(sysUser.age) : sysUser.age != null) return false;
        return status != null ? status.equals(sysUser.status) : sysUser.status == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", status=" + status +
                '}';
    }
}