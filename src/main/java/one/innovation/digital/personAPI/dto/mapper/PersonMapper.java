package one.innovation.digital.personAPI.dto.mapper;

import one.innovation.digital.personAPI.dto.request.PersonDTO;
import one.innovation.digital.personAPI.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
