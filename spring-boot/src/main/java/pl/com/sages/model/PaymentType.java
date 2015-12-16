/**
 * Copyright 2015-12-15 the original author or authors.
 */
package pl.com.sages.model;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public enum PaymentType {

    CARD("Karta"), CASH("Gotówka"), CHECK("Czek");

    PaymentType(String label) {
        this.label = label;
    }

    private String label;

    public String getLabel() {
        return label;
    }
}
