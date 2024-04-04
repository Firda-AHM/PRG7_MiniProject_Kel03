package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.RentDetailDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.CameraRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentDetailRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RentDetailDaoImpl implements RentDetailDao {
    @Autowired
    private RentDetailRepository rentDetailRepository;
    @Autowired
    private RentRepository rentRepository;
    @Autowired
    private CameraRepository cameraRepository;
    @Override
    public List<RentDetailVo> getAllRentDetails() {
        Iterable<RentDetail> rentDetails = rentDetailRepository.findAll();
        List<RentDetailVo> rentDetailVos = new ArrayList<>();
        for (RentDetail rentDetail: rentDetails) {
            RentDetailVo rentDetailVo = new RentDetailVo(rentDetail);

            Rent rent = rentRepository.findById(rentDetail.getRentDetailPK().getRnt_id()).orElseThrow();
            rentDetailVo.setRntDesc(rent.getRnt_customer());
            Camera camera = cameraRepository.findById(rentDetail.getRentDetailPK().getCam_id()).orElseThrow();
            rentDetailVo.setCamDesc(camera.getCam_name());

            rentDetailVos.add(rentDetailVo);
        }
        return rentDetailVos;
    }

    @Override
    public List<RentDetailVo> getRentDetailByRentDetailId(int id) {
        Iterable<RentDetail> rentDetails = rentDetailRepository.findRentDetailsByRentDetailPK_Drn_id(id);
        List<RentDetailVo> rentDetailVos = new ArrayList<>();
        for (RentDetail rentDetail: rentDetails) {
            RentDetailVo rentDetailVo = new RentDetailVo(rentDetail);

            Rent rent = rentRepository.findById(rentDetail.getRentDetailPK().getRnt_id()).orElseThrow();
            rentDetailVo.setRntDesc(rent.getRnt_customer());
            Camera camera = cameraRepository.findById(rentDetail.getRentDetailPK().getCam_id()).orElseThrow();
            rentDetailVo.setCamDesc(camera.getCam_name());

            rentDetailVos.add(rentDetailVo);
        }
        return rentDetailVos;
    }

    @Override
    public List<RentDetailVo> getRentDetailByRentId(int id) {
        Iterable<RentDetail> rentDetails = rentDetailRepository.findRentDetailsByRentDetailPK_Rnt_id(id);
        List<RentDetailVo> rentDetailVos = new ArrayList<>();
        for (RentDetail rentDetail: rentDetails) {
            RentDetailVo rentDetailVo = new RentDetailVo(rentDetail);

            Rent rent = rentRepository.findById(rentDetail.getRentDetailPK().getRnt_id()).orElseThrow();
            rentDetailVo.setRntDesc(rent.getRnt_customer());
            Camera camera = cameraRepository.findById(rentDetail.getRentDetailPK().getCam_id()).orElseThrow();
            rentDetailVo.setCamDesc(camera.getCam_name());

            rentDetailVos.add(rentDetailVo);
        }
        return rentDetailVos;
    }

    @Override
    public List<RentDetailVo> getRentDetailByCamId(int id) {
        Iterable<RentDetail> rentDetails = rentDetailRepository.findRentDetailsByRentDetailPK_Cam_id(id);
        List<RentDetailVo> rentDetailVos = new ArrayList<>();
        for (RentDetail rentDetail: rentDetails) {
            RentDetailVo rentDetailVo = new RentDetailVo(rentDetail);

            Rent rent = rentRepository.findById(rentDetail.getRentDetailPK().getRnt_id()).orElseThrow();
            rentDetailVo.setRntDesc(rent.getRnt_customer());
            Camera camera = cameraRepository.findById(rentDetail.getRentDetailPK().getCam_id()).orElseThrow();
            rentDetailVo.setCamDesc(camera.getCam_name());

            rentDetailVos.add(rentDetailVo);
        }
        return rentDetailVos;
    }
}
