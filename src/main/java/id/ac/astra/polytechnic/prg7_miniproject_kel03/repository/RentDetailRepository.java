package id.ac.astra.polytechnic.prg7_miniproject_kel03.repository;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetail;
import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.RentDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static id.ac.astra.polytechnic.prg7_miniproject_kel03.constant.RentDetailConstant.*;

@Repository
public interface RentDetailRepository extends JpaRepository<RentDetail, RentDetailPK> {
    @Query(value = qRentDetailByRentDetail, nativeQuery = true)
    List<RentDetail> findRentDetailsByRentDetailPK_Drn_id(int id);
    @Query(value = qRentDetailByRent, nativeQuery = true)
    List<RentDetail> findRentDetailsByRentDetailPK_Rnt_id(int id);
    @Query(value = qRentDetailByCamera, nativeQuery = true)
    List<RentDetail> findRentDetailsByRentDetailPK_Cam_id(int id);
}
