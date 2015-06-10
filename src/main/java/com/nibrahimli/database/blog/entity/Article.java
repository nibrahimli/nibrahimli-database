package com.nibrahimli.database.blog.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.JoinColumn;

@Entity
@Table(name="article")
public class Article {
	
	private Long id ;
	private String title;
	private String text;
	private Date date ;
	private String keywords;
	private Set<User> authorList;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	@Column(name="title", unique=false, nullable=false, columnDefinition="VARCHAR(255)")
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the text
	 */
	@Column(name="text", unique=false, nullable=false, columnDefinition = "LONGTEXT")
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date", unique=false, nullable=false)
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the keywords
	 */
	@Column(name="keywords", unique=false, nullable=true, columnDefinition="VARCHAR(255)")
	public String getKeywords() {
		return keywords;
	}

	/**
	 * @param keywords the keywords to set
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * @return the authorList
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "article_user", joinColumns = 
	{@JoinColumn(name = "article_id") }, inverseJoinColumns = {@JoinColumn(name = "user_id") })
	public Set<User> getAuthorList() {
		return authorList;
	}

	/**
	 * @param authorList the authorList to set
	 */
	public void setAuthorList(Set<User> authorList) {
		this.authorList = authorList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", text=" + text
				+ ", date=" + date + ", keywords=" + keywords + ", authorList="
				+ authorList + "]";
	}
}
