package org.Travel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SeatEntry {
    private int bookingId;
    private int seatEntryId;
    private int seatNumber;
    private double seatPrice;
    private String passengerName;
    private int passengerAge;
}
