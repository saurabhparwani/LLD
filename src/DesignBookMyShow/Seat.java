package DesignBookMyShow;

import DesignBookMyShow.Enums.SeatCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat {
    int seatId;
    int row;
    SeatCategory seatCategory;

}
