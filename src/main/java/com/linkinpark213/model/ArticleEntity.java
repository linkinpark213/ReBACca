package com.linkinpark213.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by ooo on 2017/5/10 0010.
 */
@Entity
@Table(name = "article", schema = "rbac")
public class ArticleEntity {
    private int id;
    private String title;
    private String content;
    private Collection<PermissionEntity> permissionsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArticleEntity that = (ArticleEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "articleByArticleId", fetch = FetchType.EAGER)
    public Collection<PermissionEntity> getPermissionsById() {
        return permissionsById;
    }

    public void setPermissionsById(Collection<PermissionEntity> permissionsById) {
        this.permissionsById = permissionsById;
    }
}
