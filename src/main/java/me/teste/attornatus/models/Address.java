package me.teste.attornatus.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor

public class Address {
    private String zipCode;
    private String address;
    private Integer number;
    private String city;
}