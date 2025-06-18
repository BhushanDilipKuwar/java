package com.truemeds.medBackup.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicineIntroductionBackup {
    private String id;
    private String medIntroduction;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMedIntroduction() {
		return medIntroduction;
	}

	public void setMedIntroduction(String medIntroduction) {
		this.medIntroduction = medIntroduction;
	}

	public MedicineIntroductionBackup() {}

    public MedicineIntroductionBackup(String id, String medIntroduction) {
        this.id = id;
        this.medIntroduction = medIntroduction;
    }
}