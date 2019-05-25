package pl.dariuszmotyka.rentalcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hire")
public class Hire extends BaseEntity {
    @Column(name = "employee_id")
    private long employeeId;
    @Column(name = "hire_date")
    private String hireDate;
    @Column(name = "reservation_id", nullable = false)
    private long reservationId;
    @Column(name = "comments")
    private String comments;

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Hire{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", reservationId=" + reservationId +
                ", comments='" + comments + '\'' +
                '}';
    }
}
