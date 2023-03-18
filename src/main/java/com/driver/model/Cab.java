package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cab
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int perKMRate;

    private boolean isAvailable;

    private CabStatus cabStatus;

    //child (Cab) to Parent(Driver) [1:1]
    @OneToOne
    @JoinColumn
    Driver driver;
}