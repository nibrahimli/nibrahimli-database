package com.nibrahimli.database.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article_category")
public class ArticleCategory {

	private Long articleId;
	private Category category;
	
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
	 * @return the categoryId
	 */
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="category_id",  referencedColumnName="id",nullable=true)
	public Category getCategory() {
		return category;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
}
