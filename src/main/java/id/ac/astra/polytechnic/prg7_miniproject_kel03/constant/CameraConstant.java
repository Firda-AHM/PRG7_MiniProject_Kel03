package id.ac.astra.polytechnic.prg7_miniproject_kel03.constant;

public class CameraConstant {
    public static final String mNotFound = "User Not Found";
    public static final String mCreateSuccess = "User Created Successfully";
    public static final String mUpdateSuccess = "User Updated Successfully";
    public static final String mDeleteSuccess = "User Deleted Successfully";
    public static final String mExistedUser = "Username or Email has been registered";
    public static final String mEmptyData = "No data available";
    public static final String mCreateFailed = "Failed to Create User";
    public static final String mUpdateFailed = "Failed to Update User";
    public static final String mDeleteFailed = "Failed to Delete User";
    public static final String qAllDataActive = "SELECT * FROM stf_msuser WHERE usr_status = ?1";
}
