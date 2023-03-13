import startegy.NormalDriveStrategy;

/***
 @author: Pratiksha Kulkarni
 date: 3/12/2023
 */
public class OffRoadVehicle  extends Vehicle{

 OffRoadVehicle(){
  super(new NormalDriveStrategy());
 }
}
