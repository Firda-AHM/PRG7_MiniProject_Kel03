package id.ac.astra.polytechnic.prg7_miniproject_kel03.service.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.RentDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.RentRepository;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.service.RentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static id.ac.astra.polytechnic.prg7_miniproject_kel03.constant.CameraConstant.*;

@Service
@Transactional
public class RentServiceImpl implements RentService {
    @Autowired
    private RentDao rentDao;
    @Autowired
    private RentRepository rentRepository;
    @Override
    public DtoResponse getAllRents() {
        if (rentDao.getAllRents() != null) {
            return new DtoResponse(200, rentDao.getAllRents());
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse getRentById(int id) {
        if (rentDao.getRentById(id) != null) {
            return new DtoResponse(200, rentDao.getRentById(id));
        }
        return new DtoResponse(500, null, mEmptyData);
    }

    @Override
    public DtoResponse saveRent(Rent rent) {
        try {
            rent.setRnt_status(0);
            rent.setRnt_charge(BigDecimal.valueOf(0));
            rent.setRnt_created_by(1);
            rent.setRnt_created_date(new Date());
            rent.setRnt_modified_by(1);
            rent.setRnt_modified_date(new Date());

            rentRepository.save(rent);
            return new DtoResponse(200, rent, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500,rent,mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateRent(Rent rent) {
        if (!rentRepository.existsById(rent.getRnt_id())) {
            return new DtoResponse(500,rent,mNotFound);
        }
        Rent updatedRent = rentRepository.findById(rent.getRnt_id()).orElseThrow();

        LocalDate rentStartDate = LocalDate.of(rent.getRnt_rent_date().getYear(),rent.getRnt_rent_date().getMonth(),rent.getRnt_rent_date().getDay());

        LocalDate rentEndDate = LocalDate.of(rent.getRnt_rent_return().getYear(),rent.getRnt_rent_date().getMonth(),rent.getRnt_rent_date().getDay());

        long late = ChronoUnit.DAYS.between(rentStartDate, rentEndDate);

        if (late > rent.getRnt_time()) {
            BigDecimal ch = BigDecimal.valueOf(late).multiply(BigDecimal.valueOf(100000));

            updatedRent.setRnt_charge(ch);
            updatedRent.setRnt_status(2);
        } else {
            updatedRent.setRnt_charge(BigDecimal.valueOf(0));
            updatedRent.setRnt_status(1);
        }

        updatedRent.setRnt_modified_by(1);
        updatedRent.setRnt_modified_date(new Date());

        try {
            rentRepository.save(updatedRent);
            return new DtoResponse(200,updatedRent,mUpdateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500,rent,mUpdateFailed);
        }
    }
}
