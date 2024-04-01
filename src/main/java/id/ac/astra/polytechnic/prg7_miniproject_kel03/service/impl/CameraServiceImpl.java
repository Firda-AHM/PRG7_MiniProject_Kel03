package id.ac.astra.polytechnic.prg7_miniproject_kel03.service.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.CameraDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.CameraRepository;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.CameraService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static id.ac.astra.polytechnic.prg7_miniproject_kel03.constant.CameraConstant.*;

@Service
@Transactional
public class CameraServiceImpl implements CameraService {
    @Autowired
    private CameraDao cameraDao;
    @Autowired
    private CameraRepository cameraRepository;


    @Override
    public DtoResponse getAllCameras(){
        if(cameraDao.getAllCameras() != null){
            return new DtoResponse(200, cameraDao.getAllCameras());
        }
        return new DtoResponse(200, null, mEmptyData);
    }
    @Override
    public DtoResponse getCameraById(int id){
        if(cameraDao.getCameraById(id) != null){
            return new DtoResponse(200, cameraDao.getCameraById(id));
        }
        return new DtoResponse(200, null, mEmptyData);
    }
    @Override
    public DtoResponse saveCamera(Camera camera) {
            try {
                cameraRepository.save(camera);
                return new DtoResponse(200,camera,mCreateSuccess);
            } catch (Exception e) {
                return new DtoResponse(200,camera,mCreateFailed);
            }
        }

    @Override
    public DtoResponse updateCamera(Camera camera) {
        try{
            Camera updatedCamera = cameraRepository.save(camera);
            if (updatedCamera != null) {
                return new DtoResponse(200, updatedCamera, mUpdateSuccess);
            } else {
                return new DtoResponse(200, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(200,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteCamera(Camera camera) {
        Camera cameraData = cameraRepository.findById(camera.getCam_id()).orElseThrow();
        if (cameraData != null) {
            try{
                cameraRepository.delete(camera);
                return new DtoResponse(200, cameraData, mDeleteSuccess);
            } catch (Exception e) {
                return new DtoResponse(200,cameraData,mDeleteFailed);
            }
        }
        return new DtoResponse(200, null, mNotFound);
    }
}
