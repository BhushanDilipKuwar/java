package com.truemeds.medBackup.repository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
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
	private MongoOperations mongoOperations;

	public void insertBackup(MedicineIntroductionBackup backup) {
		String backupCollectionName = "backupMedicine" +
				LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
		// Define the query to match _id
		Query query = new Query(Criteria.where("_id").is(backup.getId()));
		// Define the update to set medIntroduction
		Update update = new Update().set("medIntroduction", backup.getMedIntroduction());

		// Perform upsert (insert if not exist, else update)
		mongoOperations.upsert(query, update, backupCollectionName);
	}



}

