package com.caito.bussinesdomain.career.entity;

import com.caito.bussinesdomain.career.models.Pavillon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "carrers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Career {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 80)
    private String name;
    @Column(nullable = false)
    private Integer numSubjects;
    @Column(nullable = false)
    private Integer numYears;
    @Column(nullable = false)
    private Long pavillon_id;
    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;
}
