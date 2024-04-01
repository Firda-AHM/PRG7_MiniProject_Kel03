package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao;

import id.co.prg7_sertifikasi.vo.UserVo;

import java.util.List;

public interface CameraDao {
    List<UserVo> getAllUsers();
    UserVo getUserById(int id);
    UserVo getByUsername(String username);
    UserVo getByUsernameAndEmail(String username, String email);
}
