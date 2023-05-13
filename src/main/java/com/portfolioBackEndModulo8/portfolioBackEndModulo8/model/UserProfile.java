/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioBackEndModulo8.portfolioBackEndModulo8.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fabricio
 */
@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userProfileName;

    private String userProfileSurname;

    private String userProfileImage;

    private String userProfileAbout;

    public UserProfile() {
    }

    public UserProfile(String userProfileName, String userProfileSurname, String userProfileImage, String userProfileAbout) {
        this.userProfileName = userProfileName;
        this.userProfileSurname = userProfileSurname;
        this.userProfileImage = userProfileImage;
        this.userProfileAbout = userProfileAbout;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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