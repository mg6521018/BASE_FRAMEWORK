package com.magang.lazyEgg.pojo;

import java.io.Serializable;

public class Article implements Serializable{
    private Integer id;

    private String title;

    private String userid;

    private Long createtime;

    private Long updatetime;

    private String imgid;

    private String content;

    private String templateHtml;
    private String imgPath;
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid == null ? null : imgid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTemplateHtml() {
        return templateHtml;
    }

    public void setTemplateHtml(String templateHtml) {
        this.templateHtml = templateHtml;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != null ? !id.equals(article.id) : article.id != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (userid != null ? !userid.equals(article.userid) : article.userid != null) return false;
        if (createtime != null ? !createtime.equals(article.createtime) : article.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(article.updatetime) : article.updatetime != null) return false;
        if (imgid != null ? !imgid.equals(article.imgid) : article.imgid != null) return false;
        return content != null ? content.equals(article.content) : article.content == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (imgid != null ? imgid.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userid='" + userid + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", imgid='" + imgid + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}