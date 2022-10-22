package com.example.DislinktXWSProject.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.DislinktXWSProject.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document(collection = "profiles")
public class Profile {
	@Id
	private Long id;
    private User user;
    private List<String> experience;
    private List<String> education;
    private List<String> interests;
    private List<String> skills;
    private boolean privateProfile;
    private List<Long> followers;
    
    public Profile() {

	}
    
	public Profile(Long id, User user, List<String> experience, List<String> education, List<String> interests, List<String> skills, boolean privateProfile, List<Long> followers) {
		
		this.id = id;
		this.user = user;
		this.experience = experience;
		this.education = education;
		this.interests = interests;
		this.skills = skills;
		this.privateProfile = privateProfile;
		this.followers = followers;
	}
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<String> getExperience() {
		return experience;
	}
	public void setExperience(List<String> experience) {
		this.experience = experience;
	}
	public List<String> getEducation() {
		return education;
	}
	public void setEducation(List<String> education) {
		this.education = education;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public boolean isPrivateProfile() {
		return privateProfile;
	}
	public void setPrivateProfile(boolean privateProfile) {
		this.privateProfile = privateProfile;
	}
	public List<Long> getFollowers() {
		return followers;
	}
	public void setFollowers(List<Long> followers) {
		this.followers = followers;
	}

    
}