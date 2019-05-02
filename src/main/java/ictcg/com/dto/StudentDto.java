package ictcg.com.dto;

import java.time.LocalDate;

import ictcg.com.model.StudentDb;
import lombok.Data;

@Data
public class StudentDto {
	
	private long  studentId;
	private String lastNameStud;
	private String firstNameStud ;
	private String InscriptionDateStud ;

}
