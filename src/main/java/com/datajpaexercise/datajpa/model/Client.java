package com.datajpaexercise.datajpa.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "client",
        uniqueConstraints = {
        @UniqueConstraint(
                            name = "client_email_unique",
                            columnNames = "email"
                    )
                }
            )
public class Client {

    @Id
    @SequenceGenerator(
                        name = "client_sequence",
                        sequenceName = "client_sequence",
                        allocationSize = 1
    )
    @GeneratedValue(
                    strategy = SEQUENCE,
                    generator = "client_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )

    private String email;

    public Client() {
    }

    public Client(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
