
import java.awt.Color;
import java.util.LinkedList;
import java.util.Random;
/**
 * @author Muna Gigowski
 * @version March 2017
 */
abstract class Person {
    
       //Declaring all abstract variables
	protected double cashiersTime;  
	protected double eateryTime;  
        protected double createTime; 
        protected double leaveTime;
        protected double beginCheckoutTime;
        protected double beginEatTime;
        protected Simulation currSim;
        protected Color color;
        protected Location loc;
        protected LinkedList<Person> que;
        protected Random r = new Random();
        
	//Declaring all abstract methods
	public abstract void setCashiersTime(double cashTime);
        public abstract double getCashiersTime();
        public abstract void setLeaveTime(double lTime);
        public abstract double getLeaveTime();
        public abstract void setCreateTime(double CreTime);
        public abstract double getCreateTime();
        public abstract void setEateryTime(double eatTime);
        public abstract double getEateryTime();
        public abstract void setBeginCheckoutTime(double bCheck);
        public abstract double getBeginCheckoutTime();
        public abstract void setBeginEatTime(double bEat);
        public abstract double getBeginEatTime();
        public abstract Color getColor();
        public abstract void setLocation(Location locat);
        public abstract Location getLocation();
        public abstract LinkedList<Person> getQue();
        public abstract void setQue(LinkedList<Person> q);
}