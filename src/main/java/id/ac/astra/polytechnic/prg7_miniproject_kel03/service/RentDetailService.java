package id.ac.astra.polytechnic.prg7_miniproject_kel03.service;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVo;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVoForm;

import java.util.List;

public interface RentDetailService {
    DtoResponse getAllRentDetails();
    DtoResponse getRentDetailByRentDetailId(int id);
    DtoResponse getRentDetailByRentId(int id);
    DtoResponse getRentDetailByCamId(int id);
    DtoResponse saveRentDetail(RentDetailVoForm rentDetailVoForm);
//    DtoResponse updateRentDetail(RentDetailVoForm rentDetailVoForm);
}
