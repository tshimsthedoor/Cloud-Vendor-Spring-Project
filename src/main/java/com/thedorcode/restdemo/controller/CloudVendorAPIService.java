package com.thedorcode.restdemo.controller;


import com.thedorcode.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
       // return new CloudVendor("C1", "Ida Ntumba",
        //        "4 Street main road", "0987654321");
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return  "Cloud vendor create successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return  "Cloud vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor = null;
        return  "Cloud vendor deleted successfully";
    }
}
