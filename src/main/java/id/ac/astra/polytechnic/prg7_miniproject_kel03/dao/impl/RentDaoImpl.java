package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.RentDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.vo.RentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RentDaoImpl implements RentDao {
    @Autowired
    private RentRepository rentRepository;
    @Override
    public List<RentVo> getAllRents() {
        Iterable<Rent> rents = rentRepository.findAll();
        List<RentVo> rentVos = new ArrayList<>();
        for (Rent rent: rents) {
            RentVo rentVo = new RentVo(rent);
            rentVos.add(rentVo);
        }
        return rentVos;
    }

    @Override
    public RentVo getRentById(int id) {
        Rent rent = rentRepository.findById(id).orElseThrow();
        if (rent != null) {
            return new RentVo(rent);
        }
        return null;
    }
}
