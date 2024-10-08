package com.gozdecanki.userprofileservice.service;

import com.gozdecanki.userprofileservice.dto.request.UserProfileSaveRequestDto;
import com.gozdecanki.userprofileservice.mapper.IUserProfileMapper;
import com.gozdecanki.userprofileservice.model.UserProfile;
import com.gozdecanki.userprofileservice.repository.IUserProfileRepository;
import org.springframework.stereotype.Service;


@Service
public class UserProfileService extends ServiceManager<UserProfile, Long> {

    private final IUserProfileRepository repository;

    public UserProfileService(IUserProfileRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public boolean save(UserProfileSaveRequestDto dto) {
        /*
        UserProfile userProfile = new UserProfile();
        userProfile.setAutId(dto.getAuthId());
        userProfile.setUsername(dto.getUsername());
        userProfile.setEmail(dto.getEmail());
        userProfile.setAddress(dto.getAddress());
        save(userProfile);
        */

        /*
        UserProfile userProfile = UserProfile.builder()
                .autId(dto.getAuthId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .build();
        save(userProfile);
        */

        save(IUserProfileMapper.INSTANCE.toUserProfile(dto));
        return true;

    }
}