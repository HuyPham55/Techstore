/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.techstore.apiobject;

import com.techstore.techstore.entities.ProductEntity;

/**
 *
 * @author Administrator
 */
public class ProductClientObject {

    private Long id;
    private String tensp;
    private double giasp;
    private String hinhanhsp;
    private String motasp;
    private Long idsanpham;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGiasp() {
        return giasp;
    }

    public void setGiasp(double giasp) {
        this.giasp = giasp;
    }

    public String getHinhanhsp() {
        return hinhanhsp;
    }

    public void setHinhanhsp(String hinhanhsp) {
        this.hinhanhsp = hinhanhsp;
    }

    public String getMotasp() {
        return motasp;
    }

    public void setMotasp(String motasp) {
        this.motasp = motasp;
    }

    public Long getIdsp() {
        return idsanpham;
    }

    public void setIdsp(Long idsp) {
        this.idsanpham = idsp;
    }

    public ProductClientObject(ProductEntity productEntity) {
        this.id = productEntity.getId();
        this.tensp = productEntity.getName();
        this.giasp = productEntity.getPrice();
        this.hinhanhsp = productEntity.getImage();
        this.motasp = productEntity.getDescription();
        this.idsanpham = productEntity.getCategoryId();
    }

}
