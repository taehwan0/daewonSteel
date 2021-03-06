package com.daewon.daewon.domain.steeldata;

import com.daewon.daewon.domain.station.Station;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@ToString
@Getter
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class SteelData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String stationName;

    @NonNull
    @Column(nullable = false)
    private long weight;

    @NonNull
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(columnDefinition = "tinyint(1) default false")
    private boolean deleted;

    public void updateSteelData(String newStationName, long newWeight, LocalDate newDate) {
        this.stationName = newStationName;
        this.weight = newWeight;
        this.date = newDate;
    }
    public void deleteSteelData(long id) {
        this.deleted = true;
    }
}
