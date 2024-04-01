package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.CameraVo;

import java.util.List;

public interface CameraDao {
    List<CameraVo> getAllCameras();
    CameraVo getCameraById(int id);

}
