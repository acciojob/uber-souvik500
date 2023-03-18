package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
class Driver
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private int mobile;

    @Column(nullable = false, unique = true)
    private int password;

    //parent(Driver) to Child (Cab) [1:1]
    @OneToOne (mappedBy = "driver", cascade = CascadeType.ALL)
    Cab cab;


    //parent(Driver) to Child (TripBooking) [1:Many]
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<TripBooking> tripBookingList = new ArrayList<>();
}