package com.ikernelback.ikernel.Controller;
import com.ikernelback.ikernel.Business.ErrorsBusiness;
import com.ikernelback.ikernel.Dto.ErrorsDto;
import com.ikernelback.ikernel.Entity.ErrorsEntity;
import com.ikernelback.ikernel.Service.ErrorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Error")
public class ErrorsController {

    @Autowired
    private ErrorsBusiness errorsBusiness;

    @GetMapping("/all")
    public List<ErrorsDto> getAllErrors() {
        return errorsBusiness.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody ErrorsDto errorsDto) {
        errorsBusiness.create(errorsDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody ErrorsDto errorsDto) {
        errorsBusiness.update(errorsDto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") ErrorsEntity entity) {
        errorsBusiness.delete(entity);
    }
}
