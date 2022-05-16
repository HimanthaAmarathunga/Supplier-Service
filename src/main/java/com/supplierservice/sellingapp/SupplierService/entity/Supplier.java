package com.supplierservice.sellingapp.SupplierService.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "supplier")
public class Supplier {

    private int supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierContact;
}
