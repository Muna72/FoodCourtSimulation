
import java.awt.Color;
import java.util.LinkedList;
/**
 *
 * @author Muna Gigowski
 * @version March 2017
 */
public class SpecialNeedsPerson extends Person {
    
    
    /**
     * Class constructor
     * @param cashTime
     * @param eatTime
     * @param secLeave
     * @param creTime 
     */
    SpecialNeedsPerson(double cashTime, double eatTime, double secLeave, double creTime){
        
        cashiersTime = (cashTime*0.1*r.nextGaussian() + cashTime) * 2;
        eateryTime = (eatTime*0.1*r.nextGaussian() + eatTime) * 4;
        leaveTime = (secLeave*0.1*r.nextGaussian() + secLeave) * 3; 
        color = Color.RED;
    }
    
    /**
     * Method to set cashiers time
     * @param cashTime 
     */
    public void setCashiersTime(double cashTime) {
        cashiersTime = cashTime * 2;
    }
    
    /**
     * Method to get cashiers time
     * @return 
     */
    public double getCashiersTime() {
        return cashiersTime;
    }
    
    /**
     * Method to set leave time
     * @param lTime 
     */
    public void setLeaveTime(double lTime) {
        leaveTime = lTime * 3;
    }
    
    /**
     * Method to get leave time
     * @return 
     */
    public double getLeaveTime() {
        return leaveTime;
    }
    
    /**
     * Method to set person's creation time
     * @param creTime 
     */
    public void setCreateTime(double creTime) {
        createTime = creTime;
    }
    
    /**
     * Method to set eatery time
     * @param eatTime 
     */
    public void setEateryTime(double eatTime) {
        eateryTime = eatTime * 4;
    }

    /**
     * Method to get eatery time
     * @return 
     */
    public double getEateryTime() {
        return eateryTime;
    }
    
    /**
     * Method to set time a person begins checking out
     * @param bCheck 
     */
    public void setBeginCheckoutTime(double bCheck) {
        beginCheckoutTime = bCheck;
    }
    
    /**
     * Method to get time a person begins checking out
     * @return 
     */
    public double getBeginCheckoutTime(){
        return beginCheckoutTime;
    }
    
    /**
     * Method to set time a person begins ordering food
     * @param bEat 
     */
    public void setBeginEatTime(double bEat) {
        beginEatTime = bEat;
    }
    
    /**
     * Method to get time a person begins ordering food
     * @return 
     */
    public double getBeginEatTime(){
        return beginEatTime;
    }
    
    /**
     * Method to get color for this person type
     * @return 
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * Method to set person's location
     * @param locat 
     */
    public void setLocation(Location locat){
        loc = locat;   
    }
    
    /**
     * Method to get person's location
     * @return 
     */
    public Location getLocation(){
        return loc;    
    }
    
    /**
     * Method to get creation time
     * @return 
     */
    public double getCreateTime() {
        return createTime;
    }
    
    /**
     * Method to set person's que
     * @param q 
     */
    public void setQue(LinkedList<Person> q) {
        que = q;    
    }
    
    /**
     * Method to get person's que
     * @return 
     */
    public LinkedList<Person> getQue() {
        return que;
    }
}
