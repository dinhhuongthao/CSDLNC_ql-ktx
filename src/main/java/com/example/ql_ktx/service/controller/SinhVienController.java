/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ql_ktx.service.controller;

/**
 *
 * @author thaodth
 */
import com.example.ql_ktx.entity.SinhVien;
import com.example.ql_ktx.service.SinhVienService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sinhvien")
public class SinhVienController {
    private final SinhVienService sinhVienService;

    public SinhVienController(SinhVienService sinhVienService) {
        this.sinhVienService = sinhVienService;
    }

    @GetMapping
    public List<SinhVien> getAllSinhVien() {
        return sinhVienService.getAllSinhVien();
    }

    @PostMapping
    public SinhVien createSinhVien(@RequestBody SinhVien sinhVien) {
        return sinhVienService.saveSinhVien(sinhVien);
    }
}

