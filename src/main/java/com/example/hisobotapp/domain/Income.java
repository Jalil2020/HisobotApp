package com.example.hisobotapp.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private String userId;
    @Column(name = "date")
    private String date;

    @Column(name = "uzs")
    private Long uzs;

    @Column(name = "present")
    private Long present;

    @Column(name = "found")
    private Long found;

    @Column(name = "description")
    private String description;

    @Column(name = "from_income")
    private String fromIncome;

    @Column(name = "is_gift")
    private Boolean isGift;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getUzs() {
        return uzs;
    }

    public void setUzs(Long uzs) {
        this.uzs = uzs;
    }

    public Long getPresent() {
        return present;
    }

    public void setPresent(Long present) {
        this.present = present;
    }

    public Long getFound() {
        return found;
    }

    public void setFound(Long found) {
        this.found = found;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromIncome() {
        return fromIncome;
    }

    public void setFromIncome(String fromIncome) {
        this.fromIncome = fromIncome;
    }

    public Boolean getGift() {
        return isGift;
    }

    public void setGift(Boolean isGift) {
        this.isGift = isGift;
    }
}
