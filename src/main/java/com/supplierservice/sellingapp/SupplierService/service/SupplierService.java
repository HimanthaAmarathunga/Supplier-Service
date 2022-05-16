package com.supplierservice.sellingapp.SupplierService.service;

import com.supplierservice.sellingapp.SupplierService.entity.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {

    Supplier addSupplier(Supplier supplier);
    List<Supplier> getAllSuppliers();
}
