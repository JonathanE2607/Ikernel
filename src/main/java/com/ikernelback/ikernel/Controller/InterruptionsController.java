package com.ikernelback.ikernel.Controller;
import com.ikernelback.ikernel.Business.InterruptionsBusiness;
import com.ikernelback.ikernel.Dto.InterruptionsDto;
import com.ikernelback.ikernel.Entity.InterruptionsEntity;
import com.ikernelback.ikernel.Service.InterruptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/interruptions")
public class InterruptionsController {
    @Autowired
    private InterruptionsBusiness interruptionsBusiness;

    @GetMapping("/all")
    public List<InterruptionsDto> getAllInterruptions() {
        return interruptionsBusiness.findAll();
    }
    @PostMapping("/create")
    public void create(@RequestBody InterruptionsDto interruptionsDto) {
        interruptionsBusiness.create(interruptionsDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody InterruptionsDto interruptionsDto) {
        interruptionsBusiness.update(interruptionsDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") InterruptionsEntity entity) {
        interruptionsBusiness.delete(entity);
    }

}
