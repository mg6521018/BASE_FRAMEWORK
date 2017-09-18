package com.magang.lazyEgg.pojo;

import java.io.Serializable;

public class SysFile implements Serializable{
    private String id;

    private String title;

    private Long size;

    private String filepath;

    private String userid;

    private Long createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysFile sysFile = (SysFile) o;

        if (id != null ? !id.equals(sysFile.id) : sysFile.id != null) return false;
        if (title != null ? !title.equals(sysFile.title) : sysFile.title != null) return false;
        if (size != null ? !size.equals(sysFile.size) : sysFile.size != null) return false;
        if (filepath != null ? !filepath.equals(sysFile.filepath) : sysFile.filepath != null) return false;
        if (userid != null ? !userid.equals(sysFile.userid) : sysFile.userid != null) return false;
        return createtime != null ? createtime.equals(sysFile.createtime) : sysFile.createtime == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (filepath != null ? filepath.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SysFile{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                ", filepath='" + filepath + '\'' +
                ", userid='" + userid + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}