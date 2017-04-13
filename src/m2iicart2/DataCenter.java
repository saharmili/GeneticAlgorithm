/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */

public class DataCenter {
   // float capacity;
    
    final static double dataCenterSize = 100000;
   
    private String fName;
    private double fSize;
    private double fP_ini, fP_max;
    
    private ArrayList<DataSet> fDatasets;
    private int fComputationExecutionCount;
    //private int fDataSetMovementCount;
    private boolean isAtMaxCapacity = false;
   // private boolean hasFixedData;
    private int fTaskExecutionCount;
 


public DataCenter(){

fDatasets = new ArrayList<DataSet>();
		fComputationExecutionCount = 0;
		//fDataSetMovementCount = 0;
}

    public int getfComputationExecutionCount() {
        return fComputationExecutionCount;
    }

//    public int getfDataSetMovementCount() {
//        return fDataSetMovementCount;
//    }

public void resetDataCenter(){
  //clear all datasets
    fDatasets.clear();
    isAtMaxCapacity= false;
   // fDataSetMovementCount=0;
    fComputationExecutionCount=0;
}
public void resetDataCenterCounts()
	{
		//fDataSetMovementCount = 0;
		fComputationExecutionCount = 0;
	}
	public void setMaxCapacity(boolean aValue)
	{
		isAtMaxCapacity = aValue;
	}

    public void setfName(String fName) {
        this.fName = fName;
    }
        
 public ArrayList<DataSet> execute(Computation aComputation) throws Exception
{
        
	if(canExecute(aComputation))
		{
			System.out.println("Datacenter " + fName + " is executing " + aComputation.getCName()+ "...");
		}
		else
		{
			ArrayList<DataSet> lRetrieved = findRetrievedSets(aComputation);
			System.out.print("Datacenter " + fName + " is executing " + aComputation.getCName() + " by retrieving ");
			for(int i = 0; i < lRetrieved.size(); i++)
			{
				System.out.print(lRetrieved.get(i) + "; ");
			}
			System.out.println();
		}
		
       /* for(int i = 0; i < aComputation.getOutput().size(); i++)
		{
			aComputation.getOutput().get(i).setExists(true);
			//aTask.getOutput().get(i).setDC(this);
			//fDatasets.add(aTask.getOutput().get(i));
		}*/
		//fComputationExecutionCount++;
		//return aComputation.getOutput();
        return null;
	}       
        	private ArrayList<DataSet> findRetrievedSets(Computation aComputation)
	{
		ArrayList<DataSet> result = new ArrayList<DataSet>();
		
		//for(int i = 0; i < aComputation.getfInput().size(); i++)
			//if(!fDatasets.contains(aComputation.getfInput().get(i)))
				//result.add(aComputation.getfInput().get(i));
		
		return result;
	}
        	public boolean canExecute(Computation aComputation)
	{
		//check that this datacenter has all the data required to execute the task
		if(!checkDependancies(aComputation))
			return false;
		
		return true;
	}
        
        	private boolean checkDependancies(Computation aComputation)
	{
//		for(int i = 0; i < aComputation.getfInput().size(); i++)
//			if(!fDatasets.contains(aComputation.getfInput().get(i)))
//				return false;
		
		return true;
	}
	public ArrayList<DataSet> getDatasets()
	{
		return fDatasets;
	}
        	public void addDataset(DataSet aDataset) throws Exception
	{
        if(fDatasets.contains(aDataset))
            return;
		if(!aDataset.exists())
		{
			//something wierd is happening!
			System.out.println("Non existant dataset " + aDataset + " was added to " + this);
			return;
		}
		
		if(freeSpace() >= aDataset.getSize())
		{
			fDatasets.add(aDataset);
			//fDataSetMovementCount++;
		}
		else
		{
			throw new Exception(this + " cannot add " + aDataset + ", " + aDataset.getSize() + " required, " 
					+ (freeSpace()) + " available");
		}
	}

 	public double utilisation()
	{
		double lUtilisation = 0;
		for(int i = 0; i < fDatasets.size(); i++)
		{
			lUtilisation += fDatasets.get(i).getSize();
		}
		
		return lUtilisation / fSize;
	}
	
	public double freeSpace()
	{
		double lUtilisation = 0;
		for(int i = 0; i < fDatasets.size(); i++)
		{
			lUtilisation += fDatasets.get(i).getSize();
		}
		
		double availableSize;
		if(isAtMaxCapacity)
			availableSize = fSize * fP_max;
		else
			availableSize = fSize * fP_ini;
		
		return availableSize - lUtilisation;
	}               

  
                
                
                
                
}
