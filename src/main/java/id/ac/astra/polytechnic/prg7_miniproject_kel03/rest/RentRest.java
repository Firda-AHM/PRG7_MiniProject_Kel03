package id.ac.astra.polytechnic.prg7_miniproject_kel03.rest;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/rents")
public class RentRest {
    @Autowired
    private RentService rentService;
    public RentRest(RentService rentService) {
        this.rentService = rentService;
    }
    @GetMapping("/getRents")
    public DtoResponse getAllRents(){
        return rentService.getAllRents();
    }
    @PostMapping("/addRent")
    public DtoResponse createRent(@RequestBody Rent rent) {
        return rentService.saveRent(rent);
    }
    @GetMapping("/getRent/{id}")
    public DtoResponse getRentById(@PathVariable int id) {
        return rentService.getRentById(id);
    }
    @PostMapping("/updateRent")
    public DtoResponse updateRent(@RequestBody Rent rent) {
        return rentService.updateRent(rent);
    }
}