import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Calculators {
	private double beerGravity=1.00;
	private double beerVol=19; // vol in Liters
	private String beerName="DEFAULT BEER";
	
	
	public double calcIBU(double aa,double oz,double gravity,double time,double vol){
		//TODO I think vol needs to be in gal for this calc
		
		double ibu=(((aa*oz)*(1.65*Math.pow(.000125, (gravity-1.)))*(((1-Math.pow(Math.E, (-.04*time)))/4.15))*75)/vol);
				
		return ibu;
	}
	public void interfaceBeerStats() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		pw.println("What is the name of your beer?:\n");
		beerName = br.readLine();
		pw.println("Input the size of your batch (in Liters):\n");
		beerVol = br.read();
		pw.println("Input the Specific gravity reading of your beer after Mashing (ex: 1.043):\n");
		beerGravity = br.read();
	}
	public double interfaceCalcIBU() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		//take in all the variables for IBU calc
		pw.println("Input the Alpha acid of the Hop:\n");
		double aa = br.read();
		pw.println("Input how many ounces of Hops you are adding:\n");
		double oz = br.read();
		pw.println("Input the amount of time the Hops will be boiled for:\n");
		double time = br.read();
		//calc IBU
		double ibu=calcIBU(aa,oz,beerGravity,time,beerVol);
		
		return ibu;
	}

}
