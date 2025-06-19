package com.truemeds.medBackup.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document(collection = "MedicineDetails")
public class MedicineDetails {

    @Id
    private String id;
    private Long userId;
    private String userName;
    private Date createdOn;
    private Date modifiedOn;
    private String skuName;
    private String medIntroduction;
    private String medActivity;
    private String medUses;
    private String medDirectionForUse;
    private String medSideEffects;
    private String companyName;
    private String companyAddress;
    private String alternateMedicineName1;
    private String alternateMedicineName2;
    private String disease1;
    private String disease2;
    private String disease3;
    private String altDisease1;
    private String altDisease2;
    private Long templateId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getMedIntroduction() {
		return medIntroduction;
	}
	public void setMedIntroduction(String medIntroduction) {
		this.medIntroduction = medIntroduction;
	}
	public String getMedActivity() {
		return medActivity;
	}
	public void setMedActivity(String medActivity) {
		this.medActivity = medActivity;
	}
	public String getMedUses() {
		return medUses;
	}
	public void setMedUses(String medUses) {
		this.medUses = medUses;
	}
	public String getMedDirectionForUse() {
		return medDirectionForUse;
	}
	public void setMedDirectionForUse(String medDirectionForUse) {
		this.medDirectionForUse = medDirectionForUse;
	}
	public String getMedSideEffects() {
		return medSideEffects;
	}
	public void setMedSideEffects(String medSideEffects) {
		this.medSideEffects = medSideEffects;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getAlternateMedicineName1() {
		return alternateMedicineName1;
	}
	public void setAlternateMedicineName1(String alternateMedicineName1) {
		this.alternateMedicineName1 = alternateMedicineName1;
	}
	public String getAlternateMedicineName2() {
		return alternateMedicineName2;
	}
	public void setAlternateMedicineName2(String alternateMedicineName2) {
		this.alternateMedicineName2 = alternateMedicineName2;
	}
	public String getDisease1() {
		return disease1;
	}
	public void setDisease1(String disease1) {
		this.disease1 = disease1;
	}
	public String getDisease2() {
		return disease2;
	}
	public void setDisease2(String disease2) {
		this.disease2 = disease2;
	}
	public String getDisease3() {
		return disease3;
	}
	public void setDisease3(String disease3) {
		this.disease3 = disease3;
	}
	public String getAltDisease1() {
		return altDisease1;
	}
	public void setAltDisease1(String altDisease1) {
		this.altDisease1 = altDisease1;
	}
	public String getAltDisease2() {
		return altDisease2;
	}
	public void setAltDisease2(String altDisease2) {
		this.altDisease2 = altDisease2;
	}
	public Long getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}
	public MedicineDetails(String id, Long userId, String userName, Date createdOn, Date modifiedOn, String skuName,
			String medIntroduction, String medActivity, String medUses, String medDirectionForUse,
			String medSideEffects, String companyName, String companyAddress, String alternateMedicineName1,
			String alternateMedicineName2, String disease1, String disease2, String disease3, String altDisease1,
			String altDisease2, Long templateId) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
		this.skuName = skuName;
		this.medIntroduction = medIntroduction;
		this.medActivity = medActivity;
		this.medUses = medUses;
		this.medDirectionForUse = medDirectionForUse;
		this.medSideEffects = medSideEffects;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.alternateMedicineName1 = alternateMedicineName1;
		this.alternateMedicineName2 = alternateMedicineName2;
		this.disease1 = disease1;
		this.disease2 = disease2;
		this.disease3 = disease3;
		this.altDisease1 = altDisease1;
		this.altDisease2 = altDisease2;
		this.templateId = templateId;
	}
    
}
