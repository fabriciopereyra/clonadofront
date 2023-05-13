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
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String educationUrl;

    private String educationImage;

    private String educationTitle;

    private String educationPeriod;

    private String educationInstitution;

    public Education() {
    }

    public Education(String educationUrl, String educationImage, String educationTitle, String educationPeriod, String educationInstitution) {
        this.educationUrl = educationUrl;
        this.educationImage = educationImage;
        this.educationTitle = educationTitle;
        this.educationPeriod = educationPeriod;
        this.educationInstitution = educationInstitution;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEducationUrl() {
        return educationUrl;
    }

    public void setEducationUrl(String educationUrl) {
        this.educationUrl = educationUrl;
    }

    public String getEducationImage() {
        return educationImage;
    }

    public void setEducationImage(String educationImage) {
        this.educationImage = educationImage;
    }

    public String getEducationTitle() {
        return educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public String getEducationPeriod() {
        return educationPeriod;
    }

    public void setEducationPeriod(String educationPeriod) {
        this.educationPeriod = educationPeriod;
    }

    public String getEducationInstitution() {
        return educationInstitution;
    }

    public void setEducationInstitution(String educationInstitution) {
        this.educationInstitution = educationInstitution;
    }

}
