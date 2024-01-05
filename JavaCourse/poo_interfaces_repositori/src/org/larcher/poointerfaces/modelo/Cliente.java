package org.larcher.poointerfaces.modelo;
import java.util.*;
public class Cliente {

    private Integer id;
    private String name;
    private String lastname;
    private static int lastid;

    public Cliente(){
        this.id = ++lastid;
    }

    public Cliente(String name, String lastname){
        this();
        this.name = name;
        this.lastname = lastname;
    }

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
