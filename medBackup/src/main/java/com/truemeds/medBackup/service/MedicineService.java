package com.truemeds.medBackup.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.truemeds.medBackup.entity.MedicineDetails;
import com.truemeds.medBackup.entity.MedicineIntroductionBackup;
import com.truemeds.medBackup.repository.BackupRepositoryFactory;
import com.truemeds.medBackup.repository.MedicineRepository;

import java.util.List;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Autowired
    private BackupRepositoryFactory backupRepositoryFactory;  // <-- Inject the factory

    public List<MedicineDetails> removeMedIntroductionAndBackup() {
        List<MedicineDetails> documents = medicineRepository.findAll();

        for (MedicineDetails doc : documents) {
            if (doc.getMedIntroduction() != null && !doc.getMedIntroduction().isEmpty()) {
                // Create backup object
                MedicineIntroductionBackup backup = new MedicineIntroductionBackup(doc.getId(), doc.getMedIntroduction());

                // Insert backup (will upsert to backup collection with date suffix)
                backupRepositoryFactory.insertBackup(backup);

                // Remove medIntroduction value (set empty string or null)
                doc.setMedIntroduction("");

                // Save updated medicine document
                medicineRepository.save(doc);
            }
        }

        return medicineRepository.findAll();
    }
}