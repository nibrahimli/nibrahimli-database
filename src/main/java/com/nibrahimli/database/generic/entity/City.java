package com.nibrahimli.database.generic.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id ;
	private String name ;
	private String originalName ;
	private Integer postalCode ;
	private Set<District> districts;
	
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
	 * @param originalName the orginalName to set
	 */
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}
	/**
	 * @return the postalCode
	 */
	@Column(name="postal_code", nullable=true, length=10)
	public Integer getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the districts
	 */
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(
            name="city_district",
            joinColumns = @JoinColumn(name="city_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="district_id", referencedColumnName="id")
    )
	public Set<District> getDistricts() {
		return districts;
	}
	/**
	 * @param districts the districts to set
	 */
	public void setDistricts(Set<District> districts) {
		this.districts = districts;
	}
}
