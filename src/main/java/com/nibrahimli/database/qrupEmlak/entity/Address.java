package com.nibrahimli.database.qrupEmlak.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String street ;
	private String number ;
	private District district ;
	private City city ;
	private Country country ;

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
	 * @return the street
	 */
	@Column(name="street", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci")
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the number
	 */
	@Column(name="number", columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_turkish_ci")
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the district
	 */
	@OneToOne
	@JoinColumn(name = "district_id", referencedColumnName = "id")
	public District getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(District district) {
		this.district = district;
	}
	/**
	 * @return the city
	 */
	@OneToOne
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
	/**
	 * @return the country
	 */
	@OneToOne
	@JoinColumn(name = "country_id", referencedColumnName = "id")
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
}
