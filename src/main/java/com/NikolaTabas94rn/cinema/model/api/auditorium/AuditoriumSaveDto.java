package com.NikolaTabas94rn.cinema.model.api.auditorium;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AuditoriumSaveDto {

    String name;

    int seats_no;
}