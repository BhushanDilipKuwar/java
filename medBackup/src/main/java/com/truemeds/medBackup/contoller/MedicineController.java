package com.truemeds.medBackup.contoller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.truemeds.medBackup.service.MedicineService;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

  

    @PostMapping("/remove-introduction/{id}")
    public String removeMedIntroduction(@PathVariable String id) {
        return medicineService.removeMedIntroductionAndBackup(id);
    }
}
