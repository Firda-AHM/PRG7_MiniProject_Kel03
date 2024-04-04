package id.ac.astra.polytechnic.prg7_miniproject_kel03.rest;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.RentDetailService;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rentdetails")
public class RentDetailRest {
    @Autowired
    private RentDetailService rentDetailService;
    public RentDetailRest(RentDetailService rentDetailService) {
        this.rentDetailService = rentDetailService;
    }
    @GetMapping("/getRentDetails")
    public DtoResponse getAllRentDetails(){
        return rentDetailService.getAllRentDetails();
    }
    @PostMapping("/addRentDetail")
    public DtoResponse createRentDetail(@RequestBody RentDetailVoForm rentDetailVoForm) {
        return rentDetailService.saveRentDetail(rentDetailVoForm);
    }
//    @GetMapping("/getRentDetail/{id}")
//    public DtoResponse getRentDetailById(@PathVariable int id) {
//        return rentDetailService.getRentDetailById(id);
//    }
//    @PutMapping("/updateRentDetail")
//    public DtoResponse updateRentDetail(@RequestBody RentDetail rent) {
//        return rentDetailService.updateRentDetail(rent);
//    }
}