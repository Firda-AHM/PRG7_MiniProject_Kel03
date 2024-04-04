package id.ac.astra.polytechnic.prg7_miniproject_kel03.service;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Rent;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.response.DtoResponse;

public interface RentService {
    DtoResponse getAllRents();
    DtoResponse getRentById(int id);
    DtoResponse saveRent(Rent rent);
    DtoResponse updateRent(Rent rent);
}
