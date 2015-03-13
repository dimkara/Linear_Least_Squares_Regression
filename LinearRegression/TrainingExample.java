package LinearRegression;

import java.util.ArrayList;
import java.util.Vector;


public class TrainingExample {
     private ArrayList <Double> xlist;   // perilamvanei ta x tou paradeigmatos
     private double y;  // einai to y, diladi i pragmatiki apokrisi tou paradeigmatos
     
     public TrainingExample(){
    	 this.xlist=new ArrayList<Double>();
    	 this.y=0;
     }
     
     public int size(){
    	 return xlist.size();
     }
     public void addx(double x){
    	 this.xlist.add(x);
     }
     
     public double getX(int i){
    	 return xlist.get(i);
     }
     
     public void setY(double y){
    	 this.y=y;
     }
     
     public ArrayList <Double> getX(){
    	 return this.xlist;
     }
     
     public double getY(){
    	 return this.y;
     }
     
     public double apoklisi(ArrayList<Double> w){   // Ipologizei tin apoklisi
    	 
    	 
    	 double z=0;
    	 
    	 for(int i=0;i<w.size();i++){   // ipologizoume tin f(x) me ta vari pou vriskontai sto ArrayList w pou dexetai i sinartisi ws orisma
    		 
    		 z+=w.get(i)*xlist.get(i);
    	 }
    	 z = z - y;
    	 return z;
    	 
     }
     
 
     
     public double error(ArrayList<Double> w){   // ipologizoume to E(w)
    	 double e=0;
    	  
         double e2 = Math.pow(this.apoklisi(w),2);  // ipsonoume tin apoklisi sto tetragwno
    		 
         e+=e2;
    	
    	 e=e/2;   // diairoume dia 2
    	 
    	 return e;
     }
     
     
}
