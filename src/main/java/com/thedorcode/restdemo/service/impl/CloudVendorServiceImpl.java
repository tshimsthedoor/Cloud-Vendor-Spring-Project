package com.thedorcode.restdemo.service.impl;

import com.thedorcode.restdemo.model.CloudVendor;
import com.thedorcode.restdemo.repository.CloudVendorRepository;
import com.thedorcode.restdemo.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        return null;
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        return null;
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        return null;
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return null;
    }
}
