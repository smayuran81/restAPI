package com.example.restapi.persistence.model;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRIV_ID")
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = false, nullable = true)
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "privileges", fetch = FetchType.EAGER)
    private Set<Role> roles;

    public Privilege() {
        super();
    }

    public Privilege(final String nameToSet) {
        super();
        name = nameToSet;
    }

    // API

  
    public Long getId() {
        return id;
    }

  
    public void setId(final Long idToSet) {
        id = idToSet;
    }

  
    public String getName() {
        return name;
    }

    public void setName(final String nameToSet) {
        name = nameToSet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String descriptionToSet) {
        description = descriptionToSet;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(final Set<Role> rolesToSet) {
        roles = rolesToSet;
    }

    //

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Privilege other = (Privilege) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getName();
    }

}
