package com.truemeds.medBackup.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MedicineIntroductionBackup {
    @Id
    private String backupId;

    public String getBackupId() {
		return backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
	}

	public String getOriginalId() {
		return originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}

	public String getMedIntroduction() {
		return medIntroduction;
	}

	public void setMedIntroduction(String medIntroduction) {
		this.medIntroduction = medIntroduction;
	}

	private String originalId;
    private String medIntroduction;

    public MedicineIntroductionBackup() {}

    public MedicineIntroductionBackup(String originalId, String medIntroduction) {
        this.originalId = originalId;
        this.medIntroduction = medIntroduction;
    }
}
