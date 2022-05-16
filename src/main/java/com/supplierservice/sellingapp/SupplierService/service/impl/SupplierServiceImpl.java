package com.supplierservice.sellingapp.SupplierService.service.impl;

import com.supplierservice.sellingapp.SupplierService.entity.Supplier;
import com.supplierservice.sellingapp.SupplierService.repository.SupplierRepository;
import com.supplierservice.sellingapp.SupplierService.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public Supplier addSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return (List<Supplier>) supplierRepository.findAll();
    }



}
