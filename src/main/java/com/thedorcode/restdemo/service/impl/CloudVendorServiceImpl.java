package com.thedorcode.restdemo.service.impl;

import com.thedorcode.restdemo.exception.CloudVendorNotFoundException;
import com.thedorcode.restdemo.model.CloudVendor;
import com.thedorcode.restdemo.repository.CloudVendorRepository;
import com.thedorcode.restdemo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "The value is success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "The value has been updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "The value has been deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // More Business Logic
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getCloudVendorName(String vendorName) {
        return cloudVendorRepository.findByVendorName(vendorName);
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Business Logic
        return cloudVendorRepository.findAll();
    }
}
