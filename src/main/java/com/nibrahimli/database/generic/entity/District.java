package com.nibrahimli.database.generic.entity;

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

@Entity
@Table(name="district")
public class District {
	
	private Long id ;
	private String name;
	private String originalName;
	private City city ;
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
	@Column(name="name", columnDefinition="VARCHAR(255)")
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
	 * @return the originalName
	 */
	@Column(name="original_name", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci")
	public String getOriginalName() {
		return originalName;
	}
	/**
	 * @param originalName the originalName to set
	 */
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	/**
	 * @return the city
	 */
//	, fetch=FetchType.LAZY --add lazy
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id", referencedColumnName = "id")
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
}
