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
    private String tensanpham;
    private double giasanpham;
    private String hinhanhsanpham;
    private String motasanpham;
    private Long idsanpham;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public double getGiasanpham() {
        return giasanpham;
    }

    public void setGiasanpham(double giasanpham) {
        this.giasanpham = giasanpham;
    }

    public String getHinhanhsanpham() {
        return hinhanhsanpham;
    }

    public void setHinhanhsanpham(String hinhanhsanpham) {
        this.hinhanhsanpham = hinhanhsanpham;
    }

    public String getMotasanpham() {
        return motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        this.motasanpham = motasanpham;
    }

    public Long getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(Long idsanpham) {
        this.idsanpham = idsanpham;
    }

    public ProductClientObject(ProductEntity productEntity) {
        this.id = productEntity.getId();
        this.tensanpham = productEntity.getName();
        this.giasanpham = productEntity.getPrice();
        this.hinhanhsanpham = productEntity.getImage();
        this.motasanpham = productEntity.getDescription();
        this.idsanpham = productEntity.getCategoryId();
    }

}
