/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEndModulo8.portfolioBackEndModulo8.dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Fabricio
 */
public class UserProfileDTO {

    @NotBlank
    private String userProfileName;

    @NotBlank
    private String userProfileSurname;

    @NotBlank
    private String userProfileImage;

    @NotBlank
    private String userProfileAbout;

    public UserProfileDTO() {
    }

    public UserProfileDTO(String userProfileName, String userProfileSurname, String userProfileImage, String userProfileAbout) {
        this.userProfileName = userProfileName;
        this.userProfileSurname = userProfileSurname;
        this.userProfileImage = userProfileImage;
        this.userProfileAbout = userProfileAbout;
    }

    public String getUserProfileName() {
        return userProfileName;
    }

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    public String getUserProfileSurname() {
        return userProfileSurname;
    }

    public void setUserProfileSurname(String userProfileSurname) {
        this.userProfileSurname = userProfileSurname;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public String getUserProfileAbout() {
        return userProfileAbout;
    }

    public void setUserProfileAbout(String userProfileAbout) {
        this.userProfileAbout = userProfileAbout;
    }

    
}

    