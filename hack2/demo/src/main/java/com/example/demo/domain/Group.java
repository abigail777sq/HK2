package com.example.demo.domain;
import jakarta.persistence.*;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="grupo")
public class Group{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToMany
@JoinTable(name = "group_persona", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "persona_id"))
private Set<Persona> personas;

    public Group() {}

    public Group(Long id, String name, Set<Persona> personas) {
        this.id = id;
        this.name = name;
        this.personas = personas;
    }

    //getteres y setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

}