package com.SchoolManagementapp.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "subject_details")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String className;
	private String subName;
	private long subCode;
	@CreationTimestamp
	private Timestamp createdAt;
	@UpdateTimestamp
	private Timestamp updatedAt;

}
