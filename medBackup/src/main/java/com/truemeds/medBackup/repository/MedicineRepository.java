package com.truemeds.medBackup.repository;





import org.springframework.data.mongodb.repository.MongoRepository;

import com.truemeds.medBackup.entity.MedicineDetails;

public interface MedicineRepository extends MongoRepository<MedicineDetails, String> {
}

    
