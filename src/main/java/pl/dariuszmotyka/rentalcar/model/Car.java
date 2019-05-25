package pl.dariuszmotyka.rentalcar.model;

import java.math.BigDecimal;

public class Car extends BaseEntity {



    private String trademark;
    private String model;
    private Body body; // nadwozie
    private short madeYear;
    private CarColor color;
    private Status status;
    private BigDecimal price;
}
