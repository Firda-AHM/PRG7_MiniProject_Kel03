package id.ac.astra.polytechnic.prg7_miniproject_kel03.service.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.RentDetailDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetailPK;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.CameraRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentDetailRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.RentDetailService;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVo;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVoForm;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static id.ac.astra.polytechnic.prg7_miniproject_kel03.constant.RentDetailConstant.*;

@Service
@Transactional
public class RentDetailServiceImpl implements RentDetailService {
    @Autowired
    private RentDetailDao rentDetailDao;
    @Autowired
    private RentDetailRepository rentDetailRepository;
    @Autowired
    private RentRepository rentRepository;
    @Autowired
    private CameraRepository cameraRepository;
    @Override
    public DtoResponse getAllRentDetails() {
        if (rentDetailDao.getAllRentDetails() != null) {
            return new DtoResponse(200, rentDetailDao.getAllRentDetails());
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse getRentDetailByRentDetailId(int id) {
        if (rentDetailDao.getRentDetailByRentDetailId(id) != null) {
            return new DtoResponse(200, rentDetailDao.getRentDetailByRentDetailId(id));
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse getRentDetailByRentId(int id) {
        if (rentDetailDao.getRentDetailByRentId(id) != null) {
            return new DtoResponse(200, rentDetailDao.getRentDetailByRentId(id));
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse getRentDetailByCamId(int id) {
        if (rentDetailDao.getRentDetailByCamId(id) != null) {
            return new DtoResponse(200, rentDetailDao.getRentDetailByCamId(id));
        }
        return new DtoResponse(500, null, mEmptyData);
    }


    @Override
    public DtoResponse saveRentDetail(RentDetailVoForm rentDetailVoForm) {
        try {
//            if (!rentRepository.existsById(rentDetailVoForm.getRntId()) || !cameraRepository.existsById(rentDetailVoForm.getCamId())) {
//                return new DtoResponse(500, rentDetailVoForm, mRentOrCameraNotFound);
//            }
            RentDetailPK rentDetailPK = new RentDetailPK();
            rentDetailPK.setRnt_id(rentDetailVoForm.getRntId());
            rentDetailPK.setCam_id(rentDetailVoForm.getCamId());

            List<RentDetailVo> list =rentDetailDao.getAllRentDetails();
            if (list.isEmpty()) {
                rentDetailPK.setDrn_id(1);
            } else {
                RentDetailVo rentDetailLast = list.get(list.size() - 1);
                rentDetailPK.setDrn_id(rentDetailLast.getDrnId() + 1);
            }

            RentDetail rentDetail =new RentDetail();
            rentDetail.setRentDetailPK(rentDetailPK);
            rentDetail.setDrn_subtotal(rentDetailVoForm.getDrnSubtotal());

            rentDetailRepository.save(rentDetail);
            return new DtoResponse(200, rentDetail, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500,rentDetailVoForm,mCreateFailed);
        }
    }

//    @Override
//    public DtoResponse updateRentDetail(RentDetailVoForm rentDetailVoForm) {
//        RentDetailPK rentDetailPK = new RentDetailPK();
//        rentDetailPK.setRnt_id(rentDetailVoForm.getRntId());
//        rentDetailPK.setCam_id(rentDetailVoForm.getCamId());
//
//        if (!rentDetailRepository.existsById(rentDetailPK)) {
//            return new DtoResponse(500,rentDetailVoForm,mNotFound);
//        }
//
//        RentDetail updatedRentDetail = rentDetailRepository.findById(rentDetail.getRnt_id()).orElseThrow();
//
//        if (rentDetail.getRnt_charge() != null) {
//            updatedRentDetail.setRnt_charge(rentDetail.getRnt_charge());
//        }
//        if (rentDetail.getRnt_status() != null) {
//            updatedRentDetail.setRnt_status(rentDetail.getRnt_status());
//        }
//
//        try {
//            rentDetailRepository.save(updatedRentDetail);
//            return new DtoResponse(200,updatedRentDetail,mUpdateSuccess);
//        } catch (Exception e) {
//            return new DtoResponse(500,rentDetail,mUpdateFailed);
//        }
//    }
}
