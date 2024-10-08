package DesignBookMyShow;

import DesignBookMyShow.Enums.City;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Theatre {
    int theatreId;
    String address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Show> shows = new ArrayList<>();


}
