package com.SchoolManagementapp.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_details")

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String sName;
	private String userName;
	private String className;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Subject> subjects;
	@CreationTimestamp
	private Timestamp createdAt;
	@UpdateTimestamp
	private Timestamp updatedAt;

}
