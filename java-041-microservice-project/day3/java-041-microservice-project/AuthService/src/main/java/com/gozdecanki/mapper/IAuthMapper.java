package com.gozdecanki.mapper;

import com.gozdecanki.dto.request.DoRegisterRequestDto;
import com.gozdecanki.dto.request.UserProfileSaveRequestDto;
import com.gozdecanki.model.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);


    //Dto --> Auth
   // Auth dtoToAuth(final Dto dto);


    //Auth --> dto
   // Dto authToDto(final Auth auth);

    Auth doRegisterRequestDtoToAuth(final DoRegisterRequestDto dto);

    Auth toAuth(final DoRegisterRequestDto dto);

//    @Mappings({
//            @Mapping(target="firstName", source="fname"),
//            @Mapping(target="lastName", source="lname")
//    })

    @Mapping(target="authId", source="id")//ismen eşleşmeyen alanlar için
    UserProfileSaveRequestDto fromAuth(final Auth auth);
}
