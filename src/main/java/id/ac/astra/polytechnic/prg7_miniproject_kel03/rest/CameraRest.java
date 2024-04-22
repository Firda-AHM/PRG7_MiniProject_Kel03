package id.ac.astra.polytechnic.prg7_miniproject_kel03.rest;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.CameraDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.CameraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class CameraRest {
    @Autowired
    private CameraService cameraService;
    @Autowired
    private CameraDao cameraDao;

    public CameraRest(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @GetMapping("/getUsers")
    public DtoResponse getAllCameras(){
        return cameraService.getAllCameras();
    }

    @PostMapping("/addCamera")
    public DtoResponse createCamera(@RequestBody Camera camera) {
        return cameraService.saveCamera(camera);
    }
    //tambah komen
    @GetMapping("/getCamera/{id}")
    public DtoResponse getCameraById(@PathVariable int id) {
        return cameraService.getCameraById(id);
    }
    @PutMapping("/updateCamera/{id}")
    public DtoResponse updateCamera(@RequestBody Camera user) {
        return cameraService.updateCamera(user);
    }
    @PostMapping("/deleteCamera")
    public DtoResponse deleteCamera(@RequestBody Camera camera) {
        return cameraService.deleteCamera(camera);
    }
}