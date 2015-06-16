package com.nibrahimli.database.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article_author")
public class ArticleAuthor {
	
	private Long articleId;
	private Author author;
	
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
	 * @return the authorId
	 */
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="author_id",  referencedColumnName="id",nullable=true)
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param authorId the userId to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	

}
