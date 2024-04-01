package id.ac.astra.polytechnic.prg7_miniproject_kel03.service.impl;

import id.co.prg7_sertifikasi.dao.UserDao;
import id.co.prg7_sertifikasi.model.User;
import id.co.prg7_sertifikasi.repository.UserRepository;
import id.co.prg7_sertifikasi.response.DtoResponse;
import id.co.prg7_sertifikasi.service.UserService;
import id.co.prg7_sertifikasi.vo.UserVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import static id.co.prg7_sertifikasi.constant.SkemaConstant.*;

@Service
@Transactional
public class CameraServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public DtoResponse getUserById(int id) {
        if (userDao.getUserById(id) != null) {
            return new DtoResponse(200,userDao.getUserById(id));
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getByUsername(String username) {
        if (userDao.getByUsername(username) != null) {
            return new DtoResponse(200,userDao.getByUsername(username));
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getByUsernameAndEmail(String username, String email) {
        if (userDao.getByUsernameAndEmail(username,email) != null) {
            return new DtoResponse(200,userDao.getByUsernameAndEmail(username,email));
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getUsers() {
        if (userDao.getAllUsers() != null) {
            List<UserVo> userVos = userDao.getAllUsers();
            return new DtoResponse(200,userVos);
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse saveUser(User user) {
        UserVo userIsExsit = userDao.getByUsernameAndEmail(user.getUsr_username(), user.getUsr_email());
        if (userIsExsit != null) {
            return new DtoResponse(200,user,mCreateFailed);
        } else {
            String encryptedPassword = passwordEncoder.encode(user.getUsr_password());
            user.setUsr_password(encryptedPassword);
            try {
                userRepository.save(user);
                return new DtoResponse(200,user,mCreateSuccess);
            } catch (Exception e) {
                return new DtoResponse(200,user,mCreateFailed);
            }
        }

    }

    @Override
    public DtoResponse updateUser(User user) {
        try{
            User updatedUser = userRepository.save(user);
            if (updatedUser != null) {
                return new DtoResponse(200, updatedUser, mUpdateSuccess);
            } else {
                return new DtoResponse(200, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(200,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteUser(User user) {
        User userData = userRepository.findById(user.getUsr_id()).orElseThrow();
        if (userData != null) {
            try{
                userRepository.delete(user);
                return new DtoResponse(200, userData, mDeleteSuccess);
            } catch (Exception e) {
                return new DtoResponse(200,userData,mDeleteFailed);
            }
        }
        return new DtoResponse(200, null, mNotFound);
    }
}
