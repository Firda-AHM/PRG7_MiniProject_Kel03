package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentDetailVo;

import java.util.List;

public interface RentDetailDao {
    List<RentDetailVo> getAllRentDetails();
    List<RentDetailVo> getRentDetailByRentDetailId(int id);
    List<RentDetailVo> getRentDetailByRentId(int id);
    List<RentDetailVo> getRentDetailByCamId(int id);
}
