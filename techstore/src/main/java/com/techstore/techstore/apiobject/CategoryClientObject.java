/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techstore.techstore.apiobject;

import com.techstore.techstore.entities.CategoryEntity;

/**
 *
 * @author Administrator
 */
public class CategoryClientObject {

    private Long id;
    private String tenloaisanpham;
    private String hinhanhloaisanpham;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenloaisanpham() {
        return tenloaisanpham;
    }

    public void setTenloaisanpham(String tenloaisanpham) {
        this.tenloaisanpham = tenloaisanpham;
    }

    public String getHinhanhloaisanpham() {
        return hinhanhloaisanpham;
    }

    public void setHinhanhloaisanpham(String hinhanhloaisanpham) {
        this.hinhanhloaisanpham = hinhanhloaisanpham;
    }

    public CategoryClientObject(CategoryEntity categoryEntity) {
        this.id = categoryEntity.getId();
        this.tenloaisanpham = categoryEntity.getName();
        this.hinhanhloaisanpham = categoryEntity.getImage();

    }

}
