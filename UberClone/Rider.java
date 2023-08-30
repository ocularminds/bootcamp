package UberClone;


public class Rider {
     String riderName;
     String riderId;
     String riderAddress;
     String riderNumber ;

     public Rider(String riderName,String riderId,String riderAddress,String rideNumber){
        this.riderName = riderName;
        this.riderId = riderId ;
        this.riderAddress = riderAddress;
        this.riderNumber = riderAddress;

     }
     public void setriderName(String riderName){
        this.riderName = riderName ;
     }
     public String getriderName(){
        return this.riderName;
     }
     public void setriderId(String riderId){
        this.riderName = riderId;

     }
     public String getriderId(){
        return this.riderId;
     }
     public void setriderAddress(String riderAddress){
            this.riderAddress = riderAddress;
     }
     public String getrideAddress(){
        return this.riderAddress;

     }
     public void setriderNumber(String riderNumber){
        this.riderNumber =riderNumber;
     }
     public String getrideNumber(){
        return riderNumber;
     }
}
 