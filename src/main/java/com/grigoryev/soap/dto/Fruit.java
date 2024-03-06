package com.grigoryev.soap.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
@XmlType(name = "Fruit")
public class Fruit {

    @XmlElement
    private String name;
    @XmlElement
    private String description;

}
