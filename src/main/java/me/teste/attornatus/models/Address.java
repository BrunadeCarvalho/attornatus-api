package me.teste.attornatus.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor

public class Address {

    private String zipCode;
    private String logradouro;
    private Integer number;
    private String city;
}
