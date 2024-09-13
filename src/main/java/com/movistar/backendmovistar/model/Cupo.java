package com.movistar.backendmovistar.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="cupos")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Cupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,length = 11,nullable = false)
    private Long mobileNumber;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private Long data;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Platform platform;

    @Column(nullable = false)
    private LocalDate cutOffDate;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

}
