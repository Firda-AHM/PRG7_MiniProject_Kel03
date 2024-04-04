package id.ac.astra.polytechnic.prg7_miniproject_kel03.constant;

public class RentDetailConstant {
    public static final String mNotFound = "Rent Detail Not Found";
    public static final String mRentOrCameraNotFound = "Camera or Rent Not Found";
    public static final String mRentNotFound = "Rent Not Found";
    public static final String mCreateSuccess = "Rent Detail Created Successfully";
    public static final String mUpdateSuccess = "Rent Detail Updated Successfully";
    public static final String mDeleteSuccess = "Rent Detail Deleted Successfully";
    public static final String mEmptyData = "No data available";
    public static final String mCreateFailed = "Failed to Create Rent Detail";
    public static final String mUpdateFailed = "Failed to Update Rent Detail";
    public static final String mDeleteFailed = "Failed to Delete Rent Detail";
    public static final String qRentDetailByRentDetail = "SELECT * FROM rcm_rentdetail WHERE drn_id = ?1";
    public static final String qRentDetailByRent = "SELECT * FROM rcm_rentdetail WHERE rnt_id = ?1";
    public static final String qRentDetailByCamera = "SELECT * FROM rcm_rentdetail WHERE cam_id = ?1";
}