package Uber;

public class Driver {
    String driverName;
    String driverAdd;
    String driverId;
    String driverNumber;
    public Driver(String driverName,String driverAdd,String driverId,String driverNumber){
        driverName =this. driverName ;
        driverAdd = this.driverAdd;
        driverId = this.driverId;
        driverNumber = this.driverNumber;
    }
    public String getDriverName(){
        return driverName;
    }
    public String getDriverAdd(){
        return driverAdd;
    }
    public String getDriverId(){
        return driverId;
    }
    public String getDriverNumber(){
        return driverNumber;
    }
    public void setDriverName(String driverName){
        this.driverNumber = driverName;
    }
    public void setDriverId(String driverId){
        this.driverId = driverId;
    }
     public void setDriverAdd(String driverAdd){
        this.driverAdd = driverAdd;
    }
    public void setDriverNumber(String driverNumber){
        this.driverAdd = driverNumber;
    }
    
    
}
