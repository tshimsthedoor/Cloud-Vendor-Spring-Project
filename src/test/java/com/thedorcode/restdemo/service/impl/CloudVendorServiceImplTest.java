package com.thedorcode.restdemo.service.impl;

import com.thedorcode.restdemo.model.CloudVendor;
import com.thedorcode.restdemo.repository.CloudVendorRepository;
import com.thedorcode.restdemo.service.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


class CloudVendorServiceImplTest {

    @Mock
    private CloudVendorRepository cloudVendorRepository;

    private CloudVendorService cloudVendorService;

    AutoCloseable autoCloseable;

    CloudVendor cloudVendor;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        cloudVendorService = new CloudVendorServiceImpl(cloudVendorRepository);
        cloudVendor = new CloudVendor("1","Aris", "34 Street", "0213456987");
    }

    @AfterEach
    void tearDown() throws  Exception{
        autoCloseable.close();
    }

    @Test
    void itShouldCreateCloudVendor() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        // When
        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);

        // Then
        assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("The value is success");
    }

    @Test
    void itShouldUpdateCloudVendor() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        // When
        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);

        // Then
        assertThat(cloudVendorService.updateCloudVendor(cloudVendor)).isEqualTo("The value has been updated");
    }

    @Test
    void itShouldDeleteCloudVendor() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class, Mockito.CALLS_REAL_METHODS);

        // When
        doAnswer(Answers.CALLS_REAL_METHODS).when(cloudVendorRepository).deleteAllById(any());

        // Then
        assertThat(cloudVendorService.deleteCloudVendor("1")).isEqualTo("The value has been deleted");
    }

    @Test
    void itShouldGetCloudVendor() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        // When
        when(cloudVendorRepository.findById("1")).thenReturn(Optional.ofNullable(cloudVendor));

        // Then
        assertThat(cloudVendorService.getCloudVendor("1").getVendorName()).isEqualTo(cloudVendor.getVendorName());
    }

    @Test
    void itShouldGetByVendorName() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        // When
        when(cloudVendorRepository.findByVendorName("Arise")).thenReturn(
                new ArrayList<CloudVendor>(Collections.singleton(cloudVendor))
        );

        // Then
        assertThat(cloudVendorService.getCloudVendorName("Arise").get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
    }

    @Test
    void itShouldGetAllCloudVendors() {
        // Given
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        // When
        when(cloudVendorRepository.findAll()).thenReturn(new ArrayList<>(
                Collections.singleton(cloudVendor)
        ));

        // Then
        assertThat(cloudVendorService.getAllCloudVendors().get(0).getVendorPhoneNumber()).isEqualTo(cloudVendor.getVendorPhoneNumber());
    }
}