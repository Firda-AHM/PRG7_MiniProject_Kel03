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
            Camera cameraToUpdate = cameraRepository.findById(camera.getCam_id()).orElseThrow();

            if (camera.getCam_name() != null) {
                cameraToUpdate.setCam_name(camera.getCam_name());
            }
            if (camera.getCam_type() != null) {
                cameraToUpdate.setCam_type(camera.getCam_type());
            }
            if (camera.getCam_price() != null) {
                cameraToUpdate.setCam_price(camera.getCam_price());
            }
            if (camera.getCam_status() != null) {
                cameraToUpdate.setCam_status(camera.getCam_status());
            }

            Camera updatedCamera = cameraRepository.save(camera);
            if (updatedCamera != null) {
                return new DtoResponse(200, updatedCamera, mUpdateSuccess);
            } else {
                return new DtoResponse(200, null, mNotFound);
            }
//
        } catch (Exception e) {
            return new DtoResponse(200,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteCamera(Camera camera) {
        try {
            Camera cameraData = cameraRepository.findById(camera.getCam_id()).orElseThrow();
            if (cameraData != null) {
                cameraData.setCam_status(0); // Set status barang menjadi nonaktif
                cameraRepository.save(cameraData);
                return new DtoResponse(200, cameraData, mDeleteSuccess);
            } else {
                return new DtoResponse(404, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(500, mDeleteFailed);
        }
    }

}
