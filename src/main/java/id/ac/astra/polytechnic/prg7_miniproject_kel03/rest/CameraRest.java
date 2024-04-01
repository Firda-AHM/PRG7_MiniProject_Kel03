package id.ac.astra.polytechnic.prg7_miniproject_kel03.rest;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.CameraService;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class CameraRest {
    @Autowired
    private CameraService cameraService;

    public CameraRest(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @GetMapping("/getUsers")
    public DtoResponse getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/saveUser")
    public DtoResponse createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/getUser/{id}")
    public DtoResponse getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
    @GetMapping("/getByUsername/{username}")
    public DtoResponse getByUsername(@PathVariable String username) {
        return userService.getByUsername(username);
    }
    @PutMapping("/updateUser/{id}")
    public DtoResponse updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public DtoResponse deleteUser(@PathVariable User user) {
        return userService.deleteUser(user);
    }
}