package com.spring.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class SearchJobsPostResponse {
    @Schema(example = "Java Developer", type = "String", description = "Only Send Title for Search Title ")
    private String title;
    @Schema(example = "1500", type = "double")
    private double firstPrice;
    @Schema(example = "2500", type = "double")
    private double lastPrice;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Schema(example = "10-04-2021", type = "String", format = "date", pattern = "dd-MM-yyyy", description = "dd-MM-yyyy")
    private Date date;
    @Schema(example = "4", type = "Integer", description = "Only Send category id for Search cateId ")
    private int cateId;
}
