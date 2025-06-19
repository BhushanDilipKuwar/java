package com.truemeds.medBackup.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.truemeds.medBackup.entity.MedicineDetails;
import com.truemeds.medBackup.entity.MedicineIntroductionBackup;
import com.truemeds.medBackup.repository.BackupRepositoryFactory;
import com.truemeds.medBackup.repository.MedicineRepository;


import java.util.Optional;

@Service
public class MedicineService {

	  @Autowired
	    private MedicineRepository medicineRepository;

	    @Autowired
	    private BackupRepositoryFactory backupRepositoryFactory;

	    public String removeMedIntroductionAndBackup(String id) {
	        Optional<MedicineDetails> optionalDoc = medicineRepository.findById(id);

	        if (optionalDoc.isPresent()) {
	            MedicineDetails doc = optionalDoc.get();

	            if (doc.getMedIntroduction() != null && !doc.getMedIntroduction().isEmpty()) {
	                // Backup
	                MedicineIntroductionBackup backup =
	                        new MedicineIntroductionBackup(doc.getId(), doc.getMedIntroduction());

	                backupRepositoryFactory.insertBackup(backup);

	                // Remove medIntroduction field
	                backupRepositoryFactory.removeMedIntroductionField(doc.getId());

	                return "medIntroduction field removed and backup stored for ID: " + id;
	            } else {
	                return "medIntroduction field is already empty or not present for ID: " + id;
	            }
	        } else {
	            return "No document found with ID: " + id;
	        }
	    }
	}
