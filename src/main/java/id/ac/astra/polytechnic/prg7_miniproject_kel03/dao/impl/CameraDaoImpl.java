package id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.impl;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.dao.CameraDao;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.repository.CameraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CameraDaoImpl implements CameraDao {
    @Autowired
    private CameraRepository cameraRepository;
    @Override
    public List<UserVo> getAllUsers() {
        Iterable<User> users = userRepository.findAll();
        List<UserVo> userVos = new ArrayList<>();
        for (User user: users) {
            UserVo userVo = new UserVo(user);
            userVos.add(userVo);
        }
        return userVos;
    }
    @Override
    public UserVo getUserById(int id) {
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            if (user.getUsr_id() == id){
                UserVo userVo = new UserVo(user);
                return userVo;
            }
        }
        return null;
    }

    @Override
    public UserVo getByUsername(String username) {
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            if (user.getUsr_name().equals(username)){
                UserVo userVo = new UserVo(user);
                return userVo;
            }
        }
        return null;
    }

    @Override
    public UserVo getByUsernameAndEmail(String username, String email) {
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            if (user.getUsr_name().equals(username) || user.getUsr_email().equals(email)){
                UserVo userVo = new UserVo(user);
                return userVo;
            }
        }
        return null;
    }
}
