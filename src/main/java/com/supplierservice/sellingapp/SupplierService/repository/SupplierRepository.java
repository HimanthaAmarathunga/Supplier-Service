package com.supplierservice.sellingapp.SupplierService.repository;

import com.supplierservice.sellingapp.SupplierService.entity.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier, Integer> {
}
