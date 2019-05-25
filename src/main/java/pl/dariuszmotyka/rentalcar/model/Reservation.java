package pl.dariuszmotyka.rentalcar.model;

import java.math.BigDecimal;

public class Reservation extends BaseEntity {

    private long reservationId;
    private String reservationDate;
    private long customerId;
    private long carId;
    private String dateFrom;
    private String dateTo;
    private long departmentReceptionId;
    private long departmentReturnId;
    private BigDecimal price;
}
