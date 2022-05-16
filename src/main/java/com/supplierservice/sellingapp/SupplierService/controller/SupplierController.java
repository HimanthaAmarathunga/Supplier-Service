package com.supplierservice.sellingapp.SupplierService.controller;

import com.supplierservice.sellingapp.SupplierService.entity.Supplier;
import com.supplierservice.sellingapp.SupplierService.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService supplierService;

    @PostMapping("/addSupplier")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.addSupplier(supplier);

    }

    @GetMapping("/allSuppliers")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
}
