package org.Travel;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TravelDetail {
    private int transactionDetailId;
    private String transactionDate;
    private int busId;
    private int openSeatCount;
    private int bookedSeatCount;

    private String fromPlace;
    private String toPlace;
    private String startTime;
    private String endTime;
    private String bookingStatus;
}
