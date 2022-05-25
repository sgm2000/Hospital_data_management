package com.midtree.hospitaldetails.service;

import java.util.List;

import com.midtree.hospitaldetails.entity.Doctor;
import com.midtree.hospitaldetails.entity.Patient;


public interface HospitalService {

    public Doctor showDoctorInformation(String name);
    public Patient showPatientInformation(Integer Id);
    public boolean saveDoctorInformation(Doctor doctor);
    public boolean savePatientInformation(Patient patient);
    public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
    public List<Doctor> getDoctors();

}
