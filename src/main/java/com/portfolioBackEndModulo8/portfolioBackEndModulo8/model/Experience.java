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
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String experienceUrl;

    private String experienceImage;

    private String experienceJobTitle;

    private String experiencePeriod;

    private String experienceActivity;

    public Experience() {
    }

    public Experience(String experienceUrl, String experienceImage, String experienceJobTitle, String experiencePeriod, String experienceActivity) {
        this.experienceUrl = experienceUrl;
        this.experienceImage = experienceImage;
        this.experienceJobTitle = experienceJobTitle;
        this.experiencePeriod = experiencePeriod;
        this.experienceActivity = experienceActivity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExperienceUrl() {
        return experienceUrl;
    }

    public void setExperienceUrl(String experienceUrl) {
        this.experienceUrl = experienceUrl;
    }

    public String getExperienceImage() {
        return experienceImage;
    }

    public void setExperienceImage(String experienceImage) {
        this.experienceImage = experienceImage;
    }

    public String getExperienceJobTitle() {
        return experienceJobTitle;
    }

    public void setExperienceJobTitle(String experienceJobTitle) {
        this.experienceJobTitle = experienceJobTitle;
    }

    public String getExperiencePeriod() {
        return experiencePeriod;
    }

    public void setExperiencePeriod(String experiencePeriod) {
        this.experiencePeriod = experiencePeriod;
    }

    public String getExperienceActivity() {
        return experienceActivity;
    }

    public void setExperienceActivity(String experienceActivity) {
        this.experienceActivity = experienceActivity;
    }

}
