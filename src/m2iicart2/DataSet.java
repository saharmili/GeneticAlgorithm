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
public class DataSet {
     final static double dataSetSize = 1024;
             //10;
    private String fName;
	private double fSize;
	private ArrayList<Computation> fComputations;
	private DataCenter fDC;
	private DataCenter fixedAddress;

        private boolean fExists;
	private boolean fWasGenerated;

     	public DataSet()
	{
		fComputations = new ArrayList<Computation>();
		fWasGenerated = false;
	}   
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getfSize() {
        return fSize;
    }

    public void setfSize(double fSize) {
        this.fSize = fSize;
    }

    public ArrayList<Computation> getfComputations() {
        return fComputations;
    }

    public void setfComputations(ArrayList<Computation> fComputations) {
        this.fComputations = fComputations;
    }

    public DataCenter getfDC() {
        return fDC;
    }

    public void setfDC(DataCenter fDC) {
        this.fDC = fDC;
    }

    public DataCenter getFixedAddress() {
        return fixedAddress;
    }

    public void setFixedAddress(DataCenter fixedAddress) {
        this.fixedAddress = fixedAddress;
    }

    public boolean isfExists() {
        return fExists;
    }

    public void setfExists(boolean fExists) {
        this.fExists = fExists;
    }

    public boolean isfWasGenerated() {
        return fWasGenerated;
    }

    public void setfWasGenerated(boolean fWasGenerated) {
        this.fWasGenerated = fWasGenerated;
    }


  public boolean exists()
	{
		return fExists;
	}
	


   	public double getSize()
	{
		return fSize;
	}

  
    
}
