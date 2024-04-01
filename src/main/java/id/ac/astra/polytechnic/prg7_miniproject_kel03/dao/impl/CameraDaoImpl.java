package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.CameraDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.CameraRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.CameraVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CameraDaoImpl implements CameraDao {
    @Autowired
    private CameraRepository cameraRepository;
    @Override
    public List<CameraVo> getAllCameras() {
        Iterable<Camera> cams = cameraRepository.findAll();
        List<CameraVo> CameraVos = new ArrayList<>();
        for (Camera cam: cams) {
            CameraVo camVo = new CameraVo(cam);
            CameraVos.add(camVo);
        }
        return CameraVos;
    }
    @Override
    public CameraVo getCameraById(int id) {
        Iterable<Camera> cameras = cameraRepository.findAll();
        for (Camera cam : cameras) {
            if (cam.getCam_id() == id){
                CameraVo camVo = new CameraVo(cam);
                return camVo;
            }
        }
        return null;
    }

}
