package com.nibrahimli.database.qrupEmlak.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="qrup_emlak_sitemap")
public class QrupEmlakSitemap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id ; 
	private String loc ;
	private Date lastMod ;
	private ChangeFreq changeFreq;
	private Float priority ;
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
	 * @return the loc
	 */
	@Column(name="loc", columnDefinition="VARCHAR(255)", nullable=false)
	public String getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	/**
	 * @return the lastMod
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_mod", length = 20)
	public Date getLastMod() {
		return lastMod;
	}
	/**
	 * @param lastMod the lastMod to set
	 */
	public void setLastMod(Date lastMod) {
		this.lastMod = lastMod;
	}
	/**
	 * @return the changeFreq
	 */
	@Column(name = "change_freq")
	@Enumerated(EnumType.STRING)
	public ChangeFreq getChangeFreq() {
		return changeFreq;
	}
	/**
	 * @param changeFreq the changeFreq to set
	 */
	public void setChangefreq(ChangeFreq changeFreq) {
		this.changeFreq = changeFreq;
	}
	/**
	 * @return the priority
	 */
	@Column(name="priority", length=2)
	public Float getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Float priority) {
		this.priority = priority;
	}

	
	public enum ChangeFreq {
		always, hourly, daily, weekly, monthly, yearly, never ;
	}
	
}
