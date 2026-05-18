package com.newlearning.learning;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.xml.validation.Schema;


@Data
@Entity
@Table(name="Address", schema = "learning")
public class Address {

    @Id
    @Column(name="address_id")
    private String addressId;

    @Column(name = "house_no")
    private String houseNo;

    @Column(name = "street_name")
    private String streetName;

    @Column(name="apt_no")
    private String aptNo;

    @Column(name = "city")
    private String city;



    @Column(name="zip_Code")
    private Integer zipCode;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "address_type_code")
    private String addressTypeCode;

    @Column(name = "id")
    private Integer id;
}
