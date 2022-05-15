package com.supplierservice.sellingapp.SupplierService.service;

import com.supplierservice.sellingapp.SupplierService.entity.Supplier;
import org.springframework.stereotype.Service;

@Service
public interface SupplierService {

    Supplier addSupplier(Supplier supplier);
}
