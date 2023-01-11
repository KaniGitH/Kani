package org.Travel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Booking {
    private int bookingId;
    private int customerId;
    private int busId;
    private int travelDetailId;
    private int numberOfSeat;
    private double totalAmount;
    private String paymentStatus;

    private String boardingPoint;
    private String arrivalPoint;
}
