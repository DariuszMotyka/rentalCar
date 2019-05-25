package pl.dariuszmotyka.rentalcar.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "departament")
public class Departament extends BaseEntity {

    @Column(name = "adress", nullable = false)
    private String adress;

    @OneToMany(mappedBy = "employeeList", fetch = FetchType.EAGER)
    private List<Employee> employeeList;

    @OneToMany(mappedBy = "carList", fetch = FetchType.EAGER)
    private List<Car> carList;


    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "adress='" + adress + '\'' +
                ", employeeList=" + employeeList +
                ", carList=" + carList +
                '}';
    }
}
