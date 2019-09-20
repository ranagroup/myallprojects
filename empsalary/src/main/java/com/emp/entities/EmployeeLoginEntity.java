package com.emp.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "employee_login")
public class EmployeeLoginEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	@Column(name = "last_signed_on")
	private String lastSignedOn;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id",referencedColumnName = "id")
	private EmployeeEntity employee;

	@PrePersist
	public void onCreate() {
		if (this.createdAt == null) {
			this.createdAt = new Date();
		}
	}

	@PreUpdate
	public void onUpdate() {
		if (this.updatedAt == null) {
			this.updatedAt = new Date();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getLastSignedOn() {
		return lastSignedOn;
	}

	public void setLastSignedOn(String lastSignedOn) {
		this.lastSignedOn = lastSignedOn;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeLoginEntity [id=" + id + ", username=" + username + ", password=" + password + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", lastSignedOn=" + lastSignedOn + ", employee=" + employee
				+ "]";
	}

	
		
	}

	

