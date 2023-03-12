/***
 @author: Pratiksha Kulkarni
 date: 3/12/2023
 */
public class Main {
 public static void main(String[] args) {
  Vehicle sVehicle = new SportsVehicle();
  Vehicle oVehicle = new OffRoadVehicle();

  sVehicle.drive();
  oVehicle.drive();
 }
}
