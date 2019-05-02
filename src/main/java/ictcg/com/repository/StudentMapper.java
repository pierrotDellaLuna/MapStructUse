package ictcg.com.repository;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ictcg.com.dto.StudentDto;
import ictcg.com.model.StudentDb;

@Mapper
public interface StudentMapper {

	//StudentDb studDToDb( StudentDto  dto );
	@Mapping(target ="studentId" , source="studentId")
	@Mapping(target ="lastNameStud" , source="lastNameStud")
	StudentDto  studDbToDto ( StudentDb  db );
}
