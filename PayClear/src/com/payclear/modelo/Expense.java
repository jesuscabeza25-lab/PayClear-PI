
package com.payclear.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Equipo PayClear
 */


public class Expense implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private double amount;
    private String payerName;
    private String dateText;
    private String category;
    private boolean settled;

    public Expense() {
        this("", "Nuevo gasto", 0.0, "Sin asignar", "--/--/----", "GENERAL", false);
    }

    public Expense(String id, String title, double amount, String payerName, String dateText, String category, boolean settled) {
        this.id = id != null ? id : "";
        this.title = (title != null && !title.isBlank()) ? title : "Nuevo gasto";
        this.amount = Math.max(0.0, amount);
        this.payerName = (payerName != null && !payerName.isBlank()) ? payerName : "Sin asignar";
        this.dateText = (dateText != null && !dateText.isBlank()) ? dateText : "--/--/----";
        this.category = (category != null && !category.isBlank()) ? category : "GENERAL";
        this.settled = settled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id != null ? id : "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio");
        }
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0 || Double.isNaN(amount)) {
            throw new IllegalArgumentException("El importe no puede ser negativo");
        }
        this.amount = amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = (payerName != null && !payerName.isBlank()) ? payerName : "Sin asignar";
    }

    public String getDateText() {
        return dateText;
    }

    public void setDateText(String dateText) {
        this.dateText = (dateText != null && !dateText.isBlank()) ? dateText : "--/--/----";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = (category != null && !category.isBlank()) ? category : "GENERAL";
    }

    public boolean isSettled() {
        return settled;
    }

    public void setSettled(boolean settled) {
        this.settled = settled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Expense)) {
            return false;
        }
        Expense expense = (Expense) o;
        return Objects.equals(id, expense.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}