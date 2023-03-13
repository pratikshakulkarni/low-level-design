import startegy.SportsDriveStrategy;

/***
 @author: Pratiksha Kulkarni
 date: 3/12/2023
 */
public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
