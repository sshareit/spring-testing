package org.dmace.demos.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(length = 64)
    private String id;

    @Column(length = 64)
    private String name;

    @Column(length = 64)
    private String surname;

    @Column(length = 128)
    private String email;

    @Column(length = 2)
    private String country;

    @CreationTimestamp
    private LocalDateTime created = LocalDateTime.now();

    @UpdateTimestamp
    private LocalDateTime updated = LocalDateTime.now();

    public Customer() {
    }

    public Customer(String id, String name, String surname, String email, String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String dcid) {
        this.id = dcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
