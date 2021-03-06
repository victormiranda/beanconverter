package com.victormiranda.beanconverter.model;


import com.victormiranda.beanconverter.annotation.Mapping;

/**
 * Created by victor on 10/09/15.
 */
public class AddressDTO {

    private Integer id;

    private String name;

    private CountryDTO country;

    @Mapping(source=AddressModel.class, field="propertyDifferentName")
    private String property;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", property='" + property + '\'' +
                '}';
    }
}
