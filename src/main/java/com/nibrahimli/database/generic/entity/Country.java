package com.nibrahimli.database.generic.entity;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id ;
	private String name ;
	private String originalName;
	private Integer code ;
	private Set<City> cities;
	
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
	 * @return the code
	 */
	@Column(name="code", nullable=true, length=10)
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the cities
	 */
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(
            name="country_city",
            joinColumns = @JoinColumn(name="country_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="city_id", referencedColumnName="id")
    )
	public Set<City> getCities() {
		return cities;
	}
	/**
	 * @param cities the cities to set
	 */
	public void setCities(Set<City> cities) {
		this.cities = cities;
	}
	
}
