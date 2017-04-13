/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import java.util.ArrayList;
import static m2iicart2.Matrix.creerMatAlea2;

/**
 *
 * @author Dell
 */
public class Computation {
    public String CName;
    public double Cfrequency;
//    protected int MnbrC=10;
//    protected int NnbrDS=150;
    //int [][] processFactor;
   protected int lNbrDC=10; 
   protected int NNbrDS=150; 
  // protected Matrix processFactor;
   //indice of computation
   protected int indice;
   //number of computations
   protected int m=100;
    protected ArrayList<DataSet> fInput;
    protected ArrayList<DataSet> fOutput;

    public Computation() {
        fInput=new ArrayList<DataSet>();
        fOutput = new ArrayList<DataSet>();
        //processFactor = new Matrix();
    }
    
//    public static void main(String[] args) {
//       // int [][] processfactor= cre
//             //   int[][] mat1 = creerMatAlea2(n,m);
//      Matrix processfactor= new Matrix();
//  int [][]  processfactor = creerMatAlea2(m, NNbrDS);
//    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public double getCfrequency() {
        return Cfrequency;
    }

    public void setCfrequency(double Cfrequency) {
        this.Cfrequency = Cfrequency;
    }

    public ArrayList<DataSet> getfInput() {
        return fInput;
    }

    public void setfInput(ArrayList<DataSet> fInput) {
        this.fInput = fInput;
    }

    public ArrayList<DataSet> getfOutput() {
        return fOutput;
    }

    public void setfOutput(ArrayList<DataSet> fOutput) {
        this.fOutput = fOutput;
    }
    	public void addInput(DataSet aDataset)
	{
		for(int i = 0; i < fInput.size(); i++)
			if(fInput.get(i).getfName().toString().compareTo(aDataset.getfName().toString()) == 0)
				return;
		
		fInput.add(aDataset);
	}
	
	public void addOutput(DataSet aDataset)
	{
		for(int i = 0; i < fOutput.size(); i++)
			if(fOutput.get(i).getfName().toString().compareTo(aDataset.getfName().toString()) == 0)
				return;
		
		fOutput.add(aDataset);
	}
    	public boolean isReady()
	{
		for(int i = 0; i < fInput.size(); i++)
		if(!fInput.get(i).exists())
			return false;
		
		return true;
	}

    public Computation(double Cfrequency, int indice) {
        
        this.Cfrequency = Cfrequency;
        this.indice = indice;
    }
    
    
   

    
}
