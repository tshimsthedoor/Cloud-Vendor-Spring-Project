package com.thedorcode.restdemo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {

    @Column
    @Id
    private String vendorId;

    @Column
    private String vendorName;

    @Column
    private String vendorAddress;

    @Column
    private String vendorPhoneNumber;


    public CloudVendor(){
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
