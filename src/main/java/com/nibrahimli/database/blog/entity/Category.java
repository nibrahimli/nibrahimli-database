package com.nibrahimli.database.blog.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="category")
public class Category {
	
	private Long id;
	private String name;
	private Category parentCategory;
	
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
	 * @return the name
	 */
	@Column(name="name", nullable=false, unique=true, columnDefinition="VARCHAR(255)")
	@Length(min=2, message="Category name must be at least 2 characters!")
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the parentCategory
	 */
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="parent_category_id")
	public Category getParentCategory() {
		return parentCategory;
	}
	/**
	 * @param parentCategory the parentCategory to set
	 */
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", parentCategory="
				+ parentCategory + "]";
	}
}
