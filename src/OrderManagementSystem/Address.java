package OrderManagementSystem;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
    int pinCode;
    String city;
    String state;

    Address(int pinCode, String city, String state){
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

}
