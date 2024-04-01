package id.ac.astra.polytechnic.prg7_miniproject_kel03.service;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;


public interface CameraService {
    DtoResponse getAllCameras();
    DtoResponse getCameraById(int id);
    DtoResponse saveCamera(Camera camera);
    DtoResponse updateCamera(Camera camera);
    DtoResponse deleteCamera(Camera camera);
}
