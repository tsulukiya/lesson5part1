package com.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "ITEM")
public class Item {
   // @JsonProperty("id")
    private Long id;
    //@JsonProperty("name")
    private String name;
    //@JsonProperty("dateCreated")
    private Date dateCreated;
    //@JsonProperty("lastUpdatedDate")
    private Date lastUpdatedDate;
    //@JsonProperty("description")
    private String description;

    public Item() {
    }

    public Item(String name, Date dateCreated, Date lastUpdatedDate, String description) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.lastUpdatedDate = lastUpdatedDate;
        this.description = description;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Item(Long id, String name, Date dateCreated, Date lastUpdatedDate, String description) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.lastUpdatedDate = lastUpdatedDate;
        this.description = description;
    }

    @Id
    @SequenceGenerator(name = "PR_SEQ", sequenceName = "PRODUCT_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PR_SEQ")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "DATE_CREATED")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = "LAST_UPDATED_DATE")
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name) &&
                Objects.equals(dateCreated, item.dateCreated) &&
                Objects.equals(lastUpdatedDate, item.lastUpdatedDate) &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateCreated, lastUpdatedDate, description);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", description='" + description + '\'' +
                '}';
    }
}
