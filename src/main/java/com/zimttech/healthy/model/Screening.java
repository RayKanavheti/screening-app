package com.zimttech.healthy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "screenings")

public class Screening extends  BaseEntity{

    @CreatedDate
    @Column(name = "screening_date", nullable = false, updatable = false)
    private LocalDateTime screeningDate = LocalDateTime.now();
    @Column(name = "weight", nullable = false)
    private Long weight;
    @Column(name = "height", nullable = false)
    private Long height;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Patient patient;
}
