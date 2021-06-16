package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "MVCBOOT_JOBSEEKERINFO")
public class JobSeekerInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer jsId;
	@Column(length = 20)
	private String jsName;
	@Column(length = 20)
	private String jsQlfy;
	@Column(length = 100)
	private String photoPath;
	@Column(length = 100)
	private String resumePath;

}
