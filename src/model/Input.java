/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
/**
 *
 * @author Christian
 */
public class Input implements ActionListener{
    JLabel lnik, lnama, ltempatlahir, ltanggallahir, ljk, lgoldar, lalamat, lrtrw, lkelurahan, lkecamatan, lagama, lstatus, lpekerjaan, lwn, lfoto, lttd, lberlaku, lkotapembuatan, ltanggalpembuatan, tanggalpembuatan, lpathfoto, lpathttd;
    JTextField nik, nama, tempatlahir, alamat, rtrw, kelurahan, kecamatan, berlaku, kotapembuatan, wnafield;
    JRadioButton pria, wanita, a, b, o , ab, wni, wna;
    ButtonGroup bg,bg2, bg3;
    JComboBox agama, status;
    JCheckBox swasta, pns, wiraswasta, akademisi, pengangguran;
    JButton insert, foto, ttd;
    JFrame frame;
    
    Properties p;
    UtilDateModel model;
    JDatePanelImpl datepanel;
    JDatePickerImpl tanggallahir;
    
    String pathfoto, pathttd;
    String[] arrayagama = {"katolik", "kristen", "hindu", "buddha", "konghuchu"};
    String[] arraystatus = {"kawin","belum kawin", "janda/duda"};
    public Input(){
        frame = new JFrame("Form input KTP");
        frame.setSize(1300,730);
        
        lnik = new JLabel("NIK : ");
        lnik.setBounds(50,50,200,30);
        nik = new JTextField();
        nik.setBounds(200,50,300,30);
        frame.add(lnik);frame.add(nik);
        
        lnama = new JLabel("Nama : ");
        lnama.setBounds(50,100,200,30);
        nama = new JTextField();
        nama.setBounds(200,100,300,30);
        frame.add(lnama);frame.add(nama);
        
        ltempatlahir = new JLabel("Tempat Lahir : ");
        ltempatlahir.setBounds(50,150,200,30);
        tempatlahir = new JTextField();
        tempatlahir.setBounds(200,150,300,30);
        frame.add(ltempatlahir);frame.add(tempatlahir);
        
        ltanggallahir = new JLabel("Tanggal Lahir : ");
        ltanggallahir.setBounds(50,200,200,30);
        model = new UtilDateModel();
        p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datepanel = new JDatePanelImpl(model,p);
        tanggallahir = new JDatePickerImpl(datepanel, new DateLabelFormatter());
        tanggallahir.setBounds(200,200,300,30);
        frame.add(ltanggallahir);frame.add(tanggallahir);
        
        ljk = new JLabel("Jenis Kelamin : ");
        ljk.setBounds(50,250,200,30);
        pria = new JRadioButton("pria");
        pria.setBounds(200,250,50,30);
        wanita = new JRadioButton("wanita");
        wanita.setBounds(250,250,80,30);
        bg = new ButtonGroup();
        bg.add(pria);bg.add(wanita);
        frame.add(ljk);frame.add(pria);frame.add(wanita);
        
        lgoldar = new JLabel("Golongan Darah : ");
        lgoldar.setBounds(50,300,200,30);
        a = new JRadioButton("A");
        a.setBounds(200,300,50,30);
        b = new JRadioButton("B");
        b.setBounds(250,300,50,30);
        o = new JRadioButton("O");
        o.setBounds(300,300,50,30);
        ab = new JRadioButton("AB");
        ab.setBounds(350,300,50,30);
        bg2 = new ButtonGroup();
        bg2.add(a);bg2.add(b);bg2.add(o);bg2.add(ab);
        frame.add(lgoldar);frame.add(a);frame.add(b);frame.add(o);frame.add(ab);
        
        lalamat = new JLabel("Alamat : ");
        lalamat.setBounds(50,350,200,30);
        alamat = new JTextField();
        alamat.setBounds(200,350,300,30);
        frame.add(lalamat);frame.add(alamat);
        
        lrtrw = new JLabel("RT / RW : ");
        lrtrw.setBounds(50,400,200,30);
        rtrw = new JTextField();
        rtrw.setBounds(200,400,300,30);
        frame.add(lrtrw);frame.add(rtrw);
        
        lkelurahan = new JLabel("Kelurahan : ");
        lkelurahan.setBounds(50,450,200,30);
        kelurahan = new JTextField();
        kelurahan.setBounds(200,450,300,30);
        frame.add(lkelurahan);frame.add(kelurahan);
        
        lkecamatan = new JLabel("Kecamatan : ");
        lkecamatan.setBounds(50,500,200,30);
        kecamatan = new JTextField();
        kecamatan.setBounds(200,500,300,30);
        frame.add(lkecamatan);frame.add(kecamatan);
        
        lagama = new JLabel("Agama : ");
        lagama.setBounds(50,550,200,30);
        agama = new JComboBox(arrayagama);
        agama.setBounds(200,550,300,30);
        frame.add(lagama);frame.add(agama);
        
        lstatus = new JLabel("Status : ");
        lstatus.setBounds(50,600,200,30);
        status = new JComboBox(arraystatus);
        status.setBounds(200,600,300,30);
        frame.add(lstatus);frame.add(status);
        
        lpekerjaan = new JLabel("Pekerjaan : ");
        lpekerjaan.setBounds(650,50,200,30);
        swasta = new JCheckBox("Swasta");
        swasta.setBounds(800,50,80,30);
        pns = new JCheckBox("PNS");
        pns.setBounds(880,50,50,30);
        wiraswasta = new JCheckBox("Wiraswasta");
        wiraswasta.setBounds(940,50,100,30);
        akademisi = new JCheckBox("Akademisi");
        akademisi.setBounds(1050,50,100,30);
        pengangguran = new JCheckBox("Pengangguran");
        pengangguran.setBounds(1150,50,120,30);
        frame.add(lpekerjaan);frame.add(swasta);frame.add(pns);frame.add(wiraswasta);frame.add(akademisi);frame.add(pengangguran);
        
        lwn = new JLabel("Warga Negara : ");
        lwn.setBounds(650,100,200,30);
        wni = new JRadioButton("WNI");
        wni.setBounds(800,100,50,30);
        wna = new JRadioButton("WNA");
        wna.setBounds(850,100,80,30);
        wnafield = new JTextField();
        wnafield.setBounds(930,100,100,30);
        wnafield.setVisible(false);
        bg3 = new ButtonGroup();
        bg3.add(wni);bg3.add(wna);
        wna.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    wnafield.setVisible(true);
                }else{
                    wnafield.setVisible(false);
                }
            }
        });
        bg = new ButtonGroup();
        frame.add(lwn);frame.add(wni);frame.add(wna);frame.add(wnafield);
        
        lfoto = new JLabel("Foto : ");
        lfoto.setBounds(650,150,200,30);
        foto = new JButton("Pilih Foto");
        foto.setBounds(800,150,100,30);
        foto.addActionListener(this);
        lpathfoto = new JLabel();
        lpathfoto.setBounds(800,175,1000,30);
        frame.add(lfoto);frame.add(foto);frame.add(lpathfoto);
        
        lttd = new JLabel("Tanda tangan : ");
        lttd.setBounds(650,200,200,30);
        ttd = new JButton("Pilih TTD");
        ttd.setBounds(800,200,100,30);
        ttd.addActionListener(this);
        lpathttd = new JLabel();
        lpathttd.setBounds(800,225,1000,30);
        frame.add(lttd);frame.add(ttd);frame.add(lpathttd);
        
        lberlaku = new JLabel("Berlaku hingga : ");
        lberlaku.setBounds(650,250,200,30);
        berlaku = new JTextField();
        berlaku.setBounds(800,250,300,30);
        frame.add(lberlaku);frame.add(berlaku);
        
        lkotapembuatan = new JLabel("Kota pembuatan KTP : ");
        lkotapembuatan.setBounds(650,300,200,30);
        kotapembuatan = new JTextField();
        kotapembuatan.setBounds(800,300,300,30);
        frame.add(lkotapembuatan);frame.add(kotapembuatan);
        
        ltanggalpembuatan = new JLabel("Tanggal pembuatan KTP : ");
        ltanggalpembuatan.setBounds(650,350,200,30);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        tanggalpembuatan = new JLabel(sdf.format(date));
        tanggalpembuatan.setBounds(900,350,300,30);
        frame.add(ltanggalpembuatan);frame.add(tanggalpembuatan);
       
        insert = new JButton("Insert");
        insert.setBounds(880,450,100,50);
        insert.addActionListener(this);
        frame.add(insert);
        
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Input();
    }
    
 
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == foto){
            JFileChooser filefoto = new JFileChooser();
            int a = filefoto.showOpenDialog(null);
            if(a == JFileChooser.APPROVE_OPTION){
                File file = filefoto.getSelectedFile();
                pathfoto = file.getAbsolutePath();
                lpathfoto.setText(pathfoto);
                lpathfoto.setVisible(true);
            }else{
                lpathfoto.setVisible(false);
            }
        }else if(e.getSource() == ttd){
            JFileChooser filettd = new JFileChooser();
            int a = filettd.showOpenDialog(null);
            if(a == JFileChooser.APPROVE_OPTION){
                File file = filettd.getSelectedFile();
                pathttd = file.getAbsolutePath();
                lpathttd.setText(pathttd);
                lpathttd.setVisible(true);
            }else{
                lpathttd.setVisible(false);
            }
        }else if(e.getSource() == insert){
            String nik = this.nik.getText();
            String nama = this.nama.getText();
            String tempatlahir = this.tempatlahir.getText();
            String alamat = this.alamat.getText();
            String rtrw = this.rtrw.getText();
            String kelurahan = this.kelurahan.getText();
            String kecamatan = this.kecamatan.getText();
            String tanggalpembuatan = this.tanggalpembuatan.getText();
            String kotapembuatan = this.kotapembuatan.getText();
            String berlaku = this.berlaku.getText();
            String jk;
            String wn;
            String goldar;
            String pathfoto = this.lpathfoto.getText();
            String pathttd = this.lpathttd.getText();
            String agama = (String) this.agama.getSelectedItem();
            String status = (String) this.status.getSelectedItem();
            String pekerjaan ="";
            
            Date tanggallahir = null;
            try {
                tanggallahir = new SimpleDateFormat("yyyy-MM-dd").parse(this.tanggallahir.getJFormattedTextField().getText());
            }catch (ParseException ex){
                Logger.getLogger(Input.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(this.pria.isSelected()){
                jk = "Pria";
            }else{
                jk = "Wanita";
            }
            
            if(this.wna.isSelected()){
                wn = "WNA (" + this.wnafield.getText() + ")";
            }else{
                wn = "WNI";
            }
            
            if(this.a.isSelected()){
                goldar = "A";
            }else if(this.b.isSelected()){
                goldar = "B";
            }else if(this.o.isSelected()){
                goldar = "O";
            }else {
                goldar = "AB";
            }
            
            if(this.swasta.isSelected()){
                pekerjaan += "Swasta";
            }else if(this.pns.isSelected()){
                pekerjaan += "PNS";
            }else if(this.akademisi.isSelected()){
                pekerjaan += "Akademisi";
            }else if(this.wiraswasta.isSelected()){
                pekerjaan += "Wiraswasta";
            }else if(this.pengangguran.isSelected()){
                pekerjaan += "Pengangguran";
            }
            
            Date tanggal =  new Date(tanggallahir.getTime());
            User user = new User(nik, nama, tempatlahir, jk, goldar, alamat, rtrw, kelurahan, kecamatan, agama, status, pekerjaan, wn, pathfoto, pathttd, berlaku, kotapembuatan, tanggalpembuatan, tanggallahir);
            new Hasil(user);
        }
    }
}
