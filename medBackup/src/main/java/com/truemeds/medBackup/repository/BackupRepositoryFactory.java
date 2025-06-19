package com.truemeds.medBackup.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.truemeds.medBackup.entity.MedicineIntroductionBackup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



@Component
public class BackupRepositoryFactory {

	    @Autowired
	    private MongoTemplate mongoTemplate;

	    public void insertBackup(MedicineIntroductionBackup backup) {
	        String backupCollectionName = "backupMedicine" +
	                LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));

	        mongoTemplate.insert(backup, backupCollectionName);
	    }

	    public void removeMedIntroductionField(String id) {
	        Query query = new Query(Criteria.where("_id").is(id));
	        Update update = new Update().unset("medIntroduction");
	        mongoTemplate.updateFirst(query, update, "MedicineDetails");
	    }
	}