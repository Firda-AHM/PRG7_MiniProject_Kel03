package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentVo;

import java.util.List;

public interface RentDao {
    List<RentVo> getAllRents();
    RentVo getRentById(int id);
}
