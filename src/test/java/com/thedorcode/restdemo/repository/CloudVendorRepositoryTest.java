package com.thedorcode.restdemo.repository;


import com.thedorcode.restdemo.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class CloudVendorRepositoryTest {

   @Autowired
    private CloudVendorRepository cloudVendorRepository;
   CloudVendor cloudVendor;

    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1", "Wes","Cape","122345");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void tearDown() {
        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }

    // Test case success
    @Test
    void testFindByVendorName_Found()
    {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Wes");
        assertThat(cloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
    }
    // Test case failure
    @Test
    void testFindByVendorName_NotFound() {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Ida");
        assertThat(cloudVendorList.isEmpty()).isTrue();
    }
}

