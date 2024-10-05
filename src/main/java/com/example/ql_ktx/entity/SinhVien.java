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
public class SinhVien {
    @Id
    private String maSV;
    private String ten;
    private String soCMT;
    private Date ngaySinh;
    private String lop;
    private String queQuan;
    // Getters and setters
}
