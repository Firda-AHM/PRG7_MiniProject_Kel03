package id.ac.astra.polytechnic.prg7_miniproject_kel03.vo;

import id.ac.astra.polytechnic.prg7_miniproject_kel03.model.Camera;

import java.math.BigDecimal;
import java.util.Date;

public class CameraVo {
    private int cam_id;
    private String cam_name;
    private String cam_type;
    private BigDecimal cam_price;
    private Integer cam_status;


    public CameraVo() {
    }

    public CameraVo(Camera camera) {
        this.cam_id = camera.getUsr_id();
        this.cam_name = camera.getUsr_name();
        this.cam_type = camera.getCam_type();
        this.cam_price = camera.getCam_price();
        this.cam_status = camera.getCam_status();
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
}
