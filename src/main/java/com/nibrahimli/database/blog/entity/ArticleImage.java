package com.nibrahimli.database.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="article_image")
public class ArticleImage {
	private Long articleId ;
	private Image image ;
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
	 * @return the image
	 */
	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="image_id", referencedColumnName="id", nullable=true)
	public Image getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArticleImage [articleId=" + articleId + ", image=" + image
				+ "]";
	}
}