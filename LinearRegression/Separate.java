package LinearRegression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Separate {
	
	public static void main(String[]args){
		Separate sep=new Separate();
		sep.readFile();
		System.out.println(Separate.total);
	}
    BufferedReader br;
    BufferedWriter bwdata;
    BufferedWriter bwvalid;
    BufferedWriter bweval;
    
    public static int total=0;
    private static int examplenumber=5872;
    public Separate(){
    	
    	
    }
    
    public void readFile(){
    try{
    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\dataSet.txt"));
    	bweval = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\evaluation.txt"));
    	bwvalid = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\validation.txt"));
     	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\parkinsons_updrs.data"));
    	
     	bwdata.flush();
     	bweval.flush();
     	bwvalid.flush();
    	int counter=0;
    	
    	int sixtpercent=(examplenumber*60)/100;
    	int twentypercent=(examplenumber*20)/100;
    	String line=br.readLine();
    	while(line!=null && counter<sixtpercent){
    		 total++;
    	     bwdata.write(line);
    	     bwdata.newLine();
    	     line=br.readLine();
    	     counter++;
        }
    	
    	System.out.println(twentypercent); 
    	
    	line=br.readLine();
    	
    	while(line!=null && counter<sixtpercent+twentypercent){
    		 
    		 total++;
    	     bweval.write(line);
    	     
    	     bweval.newLine();
    	     line=br.readLine();
    	     counter++;
        }
    	
    	line=br.readLine();
    	System.out.println((sixtpercent+twentypercent+twentypercent));
    	while(line!=null && counter<(sixtpercent+twentypercent+twentypercent)){
    		
    		 total++;
    	     
    	     bwvalid.write(line);
    	     bwvalid.newLine();
    	     line=br.readLine();
    	     counter++;
        }
    	
    	bwdata.close();bweval.close();bwvalid.close();
    	
    	br.close();
    	int tenpercent=examplenumber/10;
    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	
    	//10
    	
    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set10.txt"));
    	bwdata.flush();
    	int counter2=0;
    	line=br.readLine();
    	
    	while(line!=null && counter2 < tenpercent){
    		 
    		bwdata.write(line);
    		bwdata.newLine();
    		line=br.readLine();
    		counter2++;
    	}
    	bwdata.close();
    	
    	
    	//20%
    	
br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	
    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set20.txt"));
    	bwdata.flush();
        counter2=0;
    	line=br.readLine();
    	
    	while(line!=null && counter2 < tenpercent*2){
    		 
    		bwdata.write(line);
    		bwdata.newLine();
    		line=br.readLine();
    		counter2++;
    	}
    	bwdata.close();
    	
    	
    	//30%
    	
    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	
    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set30.txt"));
    	    	bwdata.flush();
    	        counter2=0;
    	    	line=br.readLine();
    	    	
    	    	while(line!=null && counter2 < tenpercent*3){
    	    		 
    	    		bwdata.write(line);
    	    		bwdata.newLine();
    	    		line=br.readLine();
    	    		counter2++;
    	    	}
    	    	bwdata.close();
    	    	
    	    	
    	    	//40%
    	    	
    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	
    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set40.txt"));
    	    	    	bwdata.flush();
    	    	        counter2=0;
    	    	    	line=br.readLine();
    	    	    	
    	    	    	while(line!=null && counter2 < tenpercent*4){
    	    	    		 
    	    	    		bwdata.write(line);
    	    	    		bwdata.newLine();
    	    	    		line=br.readLine();
    	    	    		counter2++;
    	    	    	}
    	    	    	bwdata.close();
    	    	    	
    	    	    	
    	    	    	//50%
    	    	    	
    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	
    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set50.txt"));
    	    	    	    	bwdata.flush();
    	    	    	        counter2=0;
    	    	    	    	line=br.readLine();
    	    	    	    	
    	    	    	    	while(line!=null && counter2 < tenpercent*5){
    	    	    	    		 
    	    	    	    		bwdata.write(line);
    	    	    	    		bwdata.newLine();
    	    	    	    		line=br.readLine();
    	    	    	    		counter2++;
    	    	    	    	}
    	    	    	    	bwdata.close();
    	    	    	    	
    	    	    	    	
    	    	    	    	//60%
    	    	    	    	
    	    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	    	
    	    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set60.txt"));
    	    	    	    	    	bwdata.flush();
    	    	    	    	        counter2=0;
    	    	    	    	    	line=br.readLine();
    	    	    	    	    	
    	    	    	    	    	while(line!=null && counter2 < tenpercent*6){
    	    	    	    	    		 
    	    	    	    	    		bwdata.write(line);
    	    	    	    	    		bwdata.newLine();
    	    	    	    	    		line=br.readLine();
    	    	    	    	    		counter2++;
    	    	    	    	    	}
    	    	    	    	    	bwdata.close();
    	    	    	    	    	
    	    	    	    	    	
    	    	    	    	    	//70%
    	    	    	    	    	
    	    	    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	    	    	
    	    	    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set70.txt"));
    	    	    	    	    	    	bwdata.flush();
    	    	    	    	    	        counter2=0;
    	    	    	    	    	    	line=br.readLine();
    	    	    	    	    	    	
    	    	    	    	    	    	while(line!=null && counter2 < tenpercent*7){
    	    	    	    	    	    		 
    	    	    	    	    	    		bwdata.write(line);
    	    	    	    	    	    		bwdata.newLine();
    	    	    	    	    	    		line=br.readLine();
    	    	    	    	    	    		counter2++;
    	    	    	    	    	    	}
    	    	    	    	    	    	bwdata.close();
    	    	    	    	    	    	
    	    	    	    	    	    	
    	    	    	    	    	    	//80%
    	    	    	    	    	    	
    	    	    	    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	    	    	    	
    	    	    	    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set80.txt"));
    	    	    	    	    	    	    	bwdata.flush();
    	    	    	    	    	    	        counter2=0;
    	    	    	    	    	    	    	line=br.readLine();
    	    	    	    	    	    	    	
    	    	    	    	    	    	    	while(line!=null && counter2 < tenpercent*8){
    	    	    	    	    	    	    		 
    	    	    	    	    	    	    		bwdata.write(line);
    	    	    	    	    	    	    		bwdata.newLine();
    	    	    	    	    	    	    		line=br.readLine();
    	    	    	    	    	    	    		counter2++;
    	    	    	    	    	    	    	}
    	    	    	    	    	    	    	bwdata.close();
    	    	    	    	    	    	    	
    	    	    	    	    	    	    	
    	    	    	    	    	    	    	//90%
    	    	    	    	    	    	    	
    	    	    	    	    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\set90.txt"));
    	    	    	    	    	    	    	    	bwdata.flush();
    	    	    	    	    	    	    	        counter2=0;
    	    	    	    	    	    	    	    	line=br.readLine();
    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	while(line!=null && counter2 < tenpercent*9){
    	    	    	    	    	    	    	    		 
    	    	    	    	    	    	    	    		bwdata.write(line);
    	    	    	    	    	    	    	    		bwdata.newLine();
    	    	    	    	    	    	    	    		line=br.readLine();
    	    	    	    	    	    	    	    		counter2++;
    	    	    	    	    	    	    	    	}
    	    	    	    	    	    	    	    	bwdata.close();   	
    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	//100%
    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	br=new BufferedReader(new FileReader("src\\LinearRegression\\datasets\\dataSet.txt"));
    	    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	    	bwdata = new BufferedWriter(new FileWriter("src\\LinearRegression\\datasets\\total.txt"));
    	    	    	    	    	    	    	    	    	bwdata.flush();
    	    	    	    	    	    	    	    	        counter2=0;
    	    	    	    	    	    	    	    	    	line=br.readLine();
    	    	    	    	    	    	    	    	    	
    	    	    	    	    	    	    	    	    	while(line!=null && counter2 < tenpercent*10){
    	    	    	    	    	    	    	    	    		 
    	    	    	    	    	    	    	    	    		bwdata.write(line);
    	    	    	    	    	    	    	    	    		bwdata.newLine();
    	    	    	    	    	    	    	    	    		line=br.readLine();
    	    	    	    	    	    	    	    	    		counter2++;
    	    	    	    	    	    	    	    	    	}
    	    	    	    	    	    	    	    	    	bwdata.close();
    	
        
     
    	
    	
       }catch(Exception e){
	 	  e.printStackTrace();
	    }
    }
    
    public void writeFile(){
    	
    }
}
