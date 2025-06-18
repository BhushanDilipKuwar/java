package com.truemeds.medBackup.contoller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.truemeds.medBackup.entity.MedicineDetails;
import com.truemeds.medBackup.service.MedicineService;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping("/remove-medIntroduction")
    public List<MedicineDetails> removeMedIntroduction() {
        return medicineService.removeMedIntroductionAndBackup();
    }
}