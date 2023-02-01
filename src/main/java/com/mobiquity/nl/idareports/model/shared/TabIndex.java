package com.mobiquity.nl.idareports.model.shared;

import javax.persistence.*;

@Entity
@Table(name = "tab_index")
public class TabIndex {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    

}
