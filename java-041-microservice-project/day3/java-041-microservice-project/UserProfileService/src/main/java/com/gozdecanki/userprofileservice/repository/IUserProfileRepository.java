package com.gozdecanki.userprofileservice.repository;


import com.gozdecanki.userprofileservice.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserProfileRepository extends JpaRepository <UserProfile, Long> {

}