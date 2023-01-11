package org.Travel;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BusEntry {
    private int busId;
    private String busName;
    private String busNumber;
    private String busFCDetail;
    private String ownerName;
    private String activeStatus;
    private String ownerContactNumber;
    private String driverNumber;
    private String busType;
    private int seatCount;

}
