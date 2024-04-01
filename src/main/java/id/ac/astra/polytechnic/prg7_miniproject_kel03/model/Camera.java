package id.ac.astra.polytechnic.prg7_miniproject_kel03.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "rcm_camera")
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cam_id")
    private int cam_id;
    @Column(name = "cam_name")
    private String cam_name;
    @Column(name = "cam_type")
    private String cam_type;
    @Column(name = "cam_price")
    private BigDecimal cam_price;
    @Column(name = "cam_status")
    private Integer cam_status;
    @Column(name = "created_by")
    private Integer created_by;
    @Column(name = "created_date")
    private Date created_date;
    @Column(name = "modified_by")
    private Integer modified_by;
    @Column(name = "modified_date")
    private Date modified_date;
    public Camera() {
    }

    public Camera(int usr_id, String usr_name, String cam_type, BigDecimal cam_price, Integer cam_status, Integer created_by, Date created_date, Integer modified_by, Date modified_date) {
        this.cam_id = usr_id;
        this.cam_name = usr_name;
        this.cam_type = cam_type;
        this.cam_price = cam_price;
        this.cam_status = cam_status;
        this.created_by = created_by;
        this.created_date = created_date;
        this.modified_by = modified_by;
        this.modified_date = modified_date;
    }

    public int getCam_id() {
        return cam_id;
    }

    public void setCam_id(int cam_id) {
        this.cam_id = cam_id;
    }

    public String getCam_name() {
        return cam_name;
    }

    public void setCam_name(String cam_name) {
        this.cam_name = cam_name;
    }

    public String getCam_type() {
        return cam_type;
    }

    public void setCam_type(String cam_type) {
        this.cam_type = cam_type;
    }

    public BigDecimal getCam_price() {
        return cam_price;
    }

    public void setCam_price(BigDecimal cam_price) {
        this.cam_price = cam_price;
    }

    public Integer getCam_status() {
        return cam_status;
    }

    public void setCam_status(Integer cam_status) {
        this.cam_status = cam_status;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Integer getModified_by() {
        return modified_by;
    }

    public void setModified_by(Integer modified_by) {
        this.modified_by = modified_by;
    }

    public Date getModified_date() {
        return modified_date;
    }

    public void setModified_date(Date modified_date) {
        this.modified_date = modified_date;
    }
}
