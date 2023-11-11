/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anzal
 */
public class Business {
    
    MasterOrderList masteroOderList;
    SupplierDirectory supplierDirectory;
    
    public Business(){
        
        masteroOderList = new MasterOrderList();
        supplierDirectory = new SupplierDirectory();
    }

    public MasterOrderList getMasteroOderList() {
        return masteroOderList;
    }

    public void setMasteroOderList(MasterOrderList masteroOderList) {
        this.masteroOderList = masteroOderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
}
