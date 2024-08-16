package ru.javarush.vasilev.domain;

import java.math.BigDecimal;

public class Country {
    private Integer id;
    private String code;
    private String alternativeCode;
    private String name;
    private Continent continent;
    private String region;
    private BigDecimal surfaceArea;
    private Short independenceYear;
    private Integer population;
    private BigDecimal lifeExpectancy;
    private BigDecimal GNP;
    private BigDecimal GNPOId;
    private String localName;
    private String governmentFrom;
    private String headOfState;
    private City city;
    private Set<CountryLanguage> languages;
}