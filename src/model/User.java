/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.util.Date;
/**
 *
 * @author Christian
 */
public class User {
    private String nik,nama,tempatlahir,jk, goldar, alamat, rtrw, kelurahan, kecamatan, agama, status, pekerjaan, wn, fotopath, ttdpath, berlaku, kotapembuatan, tanggalpembuatan;
    private Date tanggallahir;

    public User(){
        
    }

    public User(String nik, String nama, String tempatlahir, String jk, String goldar, String alamat, String rtrw, String kelurahan, String kecamatan, String agama, String status, String pekerjaan, String wn, String fotopath, String ttdpath, String berlaku, String kotapembuatan, String tanggalpembuatan, Date tanggallahir) {
        this.nik = nik;
        this.nama = nama;
        this.tempatlahir = tempatlahir;
        this.jk = jk;
        this.goldar = goldar;
        this.alamat = alamat;
        this.rtrw = rtrw;
        this.kelurahan = kelurahan;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.wn = wn;
        this.fotopath = fotopath;
        this.ttdpath = ttdpath;
        this.berlaku = berlaku;
        this.kotapembuatan = kotapembuatan;
        this.tanggalpembuatan = tanggalpembuatan;
        this.tanggallahir = tanggallahir;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getWn() {
        return wn;
    }

    public void setWn(String wn) {
        this.wn = wn;
    }

    public String getFotopath() {
        return fotopath;
    }

    public void setFotopath(String fotopath) {
        this.fotopath = fotopath;
    }

    public String getTtdpath() {
        return ttdpath;
    }

    public void setTtdpath(String ttdpath) {
        this.ttdpath = ttdpath;
    }

    public String getBerlaku() {
        return berlaku;
    }

    public void setBerlaku(String berlaku) {
        this.berlaku = berlaku;
    }

    public String getKotapembuatan() {
        return kotapembuatan;
    }

    public void setKotapembuatan(String kotapembuatan) {
        this.kotapembuatan = kotapembuatan;
    }

    public String getTanggalpembuatan() {
        return tanggalpembuatan;
    }

    public void setTanggalpembuatan(String tanggalpembuatan) {
        this.tanggalpembuatan = tanggalpembuatan;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(Date tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
    
}
