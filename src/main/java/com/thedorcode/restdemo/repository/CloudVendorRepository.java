package com.thedorcode.restdemo.repository;

import com.thedorcode.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
}
