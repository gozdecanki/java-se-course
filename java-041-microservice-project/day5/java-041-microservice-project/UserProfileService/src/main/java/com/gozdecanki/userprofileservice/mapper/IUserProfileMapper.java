package com.gozdecanki.userprofileservice.mapper;


import com.gozdecanki.userprofileservice.dto.request.UserProfileSaveRequestDto;
import com.gozdecanki.userprofileservice.model.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IUserProfileMapper {

    IUserProfileMapper INSTANCE = Mappers.getMapper( IUserProfileMapper.class );

//    DTO ----> UserProfile
//    Auth dtoToAuth(final Dto dto);

//    UserProfile ---> DTO
//    Dto authToDto(final UserProfile auth);


    UserProfile toUserProfile(final UserProfileSaveRequestDto dto);
}