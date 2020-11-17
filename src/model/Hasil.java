/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.awt.Image;
import java.util.Date;
import javax.swing.*;
/**
 *
 * @author Christian
 */
public class Hasil {
    JLabel title,nik,data,foto,ttd,tanggalbuat,tempatbuat;
    JFrame frame = new JFrame("KTP");
    static User user = new User();
    public Hasil(User user){
        frame.setSize(600, 420);
        title = new JLabel("Repulik Harapan Bangsa");
        title.setBounds(100,20,800,50);
        title.setFont(FontStyle.medium);
        frame.add(title);
        
        nik  = new JLabel("NIK : " + user.getNik());
        nik.setBounds(20,60,400,50);
        nik.setVisible(true);
        nik.setFont(FontStyle.small);
        frame.add(nik);
        
        String isi = "<html><pre>nama : " + user.getNama() +
                          "<br>Tempat, Tanggal Lahir : " + user.getTempatlahir() + user.getTempatlahir() + 
                          "<br>Jenis Kelamin : " + user.getJk() +
                          "<br>Alamat : " + user.getAlamat() +
                          "<br>\tRT/RW : " + user.getRtrw() +
                          "<br>\tKel/Desa : " + user.getKelurahan() + 
                          "<br>\tKecamatan : " + user.getKecamatan() +
                          "<br>Agama : " + user.getAgama() + 
                          "<br>Status Perkawinan : " + user.getStatus() + 
                          "<br>Pekerjaan : " + user.getPekerjaan() + 
                          "<br>Kewarganegaraan : " + user.getWn() +
                          "<br>Berlaku Hingga : " + user.getBerlaku() + "</pre></html>";
        data = new JLabel(isi);      
        data.setBounds(20,100,400,250);
        data.setVisible(true);
        data.setFont(FontStyle.vsmall);
        frame.add(data);
        
        foto = new JLabel();
        foto.setBounds(400,70,100,120);
        foto.setIcon(fotoImage(user.getFotopath()));
        frame.add(foto);
        
        tempatbuat = new JLabel(user.getKotapembuatan());
        tempatbuat.setBounds(430,190,200,10);
        frame.add(tempatbuat);
        
        tanggalbuat = new JLabel(user.getKotapembuatan());
        tanggalbuat.setBounds(430,200,200,10);
        frame.add(tanggalbuat);
        
        ttd = new JLabel();
        ttd.setBounds(390,210,120,100);
        ttd.setIcon(ttdImage(user.getTtdpath()));
        frame.add(ttd);
        
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Hasil(user);
    }
    public ImageIcon fotoImage(String fotopath){
        ImageIcon icon = new ImageIcon(fotopath);
        Image image = icon.getImage();
        Image img = image.getScaledInstance(foto.getWidth(), foto.getHeight(), image.SCALE_SMOOTH);
        ImageIcon photo = new ImageIcon(img);
        return photo;
    }
    public ImageIcon ttdImage(String ttdpath){
        ImageIcon icon = new ImageIcon(ttdpath);
        Image image = icon.getImage();
        Image img = image.getScaledInstance(ttd.getWidth(), ttd.getHeight(), image.SCALE_SMOOTH);
        ImageIcon signature = new ImageIcon(img);
        return signature;
    }
}
