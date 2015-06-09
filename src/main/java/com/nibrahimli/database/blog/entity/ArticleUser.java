package com.nibrahimli.database.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article_user")
public class ArticleUser {
	
	private Long articleId;
	private User user;
	
	/**
	 * @return the articleId
	 */
	@Id
	@Column(name = "article_id", nullable = false)
	public Long getArticleId() {
		return articleId;
	}
	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}
	/**
	 * @return the userId
	 */
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="user_id",  referencedColumnName="id",nullable=true)
	public User getUser() {
		return user;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
