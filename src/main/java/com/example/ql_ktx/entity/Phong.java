/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ql_ktx.entity;

/**
 *
 * @author thaodth
 */
@Entity
public class Phong {
    @Id
    private String soPhong;
    private String loaiPhong;
    private Double donGia;
    private Integer soNguoiToiDa;
    // Getters and setters
}
