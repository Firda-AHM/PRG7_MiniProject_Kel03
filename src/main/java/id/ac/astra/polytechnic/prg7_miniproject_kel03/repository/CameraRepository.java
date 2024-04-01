package id.ac.astra.polytechnic.prg7_miniproject_kel03.repository;

import id.co.prg7_sertifikasi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CameraRepository extends JpaRepository<User, Integer> {
}
