package com.gozdecanki.userprofileservice.controller;

import com.gozdecanki.userprofileservice.dto.request.UserProfileSaveRequestDto;
import com.gozdecanki.userprofileservice.model.UserProfile;
import com.gozdecanki.userprofileservice.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.gozdecanki.userprofileservice.constant.EndPoint.*;


// http://localhost:9091/user

@RequiredArgsConstructor
@RestController
@RequestMapping(ENDPOINT_USER)
public class UserProfileController {

    private final UserProfileService userProfileService;

/*
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }
    */

    //  http://localhost:9091/user/hello
    @GetMapping("/hello")
    public String hello (){
        return "UserProfileService Hi";
    }


    //  http://localhost:9091/user/save
    @PostMapping(ENDPOINT_SAVE)
    public ResponseEntity<Boolean> save(@RequestBody UserProfileSaveRequestDto dto){
        userProfileService.save(dto);
        return ResponseEntity.ok(Boolean.TRUE);
    }



    // Tokensiz
    @GetMapping(ENDPOINT_FIND_ALL)
    public  ResponseEntity < List<UserProfile> > findAll () {
        return ResponseEntity.ok(userProfileService.findAll());
    }

/*
    //Tokenli
    @GetMapping(ENDPOINT_FIND_ALL)
    public  ResponseEntity <List<UserProfile>> findAll (@RequestParam String token) {
        return ResponseEntity.ok(userProfileService.findAll(token)); }
*/


}