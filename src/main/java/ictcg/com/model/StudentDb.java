package ictcg.com.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDb {

	
	@Id
	private int  studentId;
	private String lastNameStud;
	private String firstNameStud ;
	private LocalDate InscriptionDateStud ;
	
	
}
