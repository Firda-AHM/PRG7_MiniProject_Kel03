package id.ac.astra.polytechnic.prg7_miniproject_kel03.service;

import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.response.DtoResponse;

public interface CameraService {
    DtoResponse getUserById(int id);
    DtoResponse getByUsername(String username);
    DtoResponse getByUsernameAndEmail(String username, String email);
    DtoResponse getUsers();
    DtoResponse saveUser(User user);
    DtoResponse updateUser(User user);
    DtoResponse deleteUser(User user);
}
