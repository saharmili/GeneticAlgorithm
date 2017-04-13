/*
 * To changeh this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Matrix.creerMatAlea1;


/**
 *
 * @author Dell
 */
public class Population {
      final static   int NnbrDS=40;
      //datacenter
final static int LnbrDC=12;

  final static   int MnbrC=30;
    
//    final static int LnbrDC=1;
//  final static   int NnbrDS=10;
//  final static   int MnbrC=7;
  final   static int PopulationSize =20;
  final static int nbrGenerations=100;
     static int [][] matSizeDS;
     
     
    final int[][] processingFactor = creerMatAlea1(MnbrC,NnbrDS); 
        Individual[] individuals;
  //final static int Generation_MAX= 200;
 //  final static int POP_SIZE = 200 ;  // population size
   final static double MUTATION_RATE = 0.05;     // probability of mutation
   final static double CROSSOVER_RATE = 0.5;     // probability of crossover  
   
   // Init population 
//POP_SIZE = number of individuals in the population 
//pop = newPop = []
   /* public static void main(String[] args) {
  !      pop = new Population()
        for(i=0;i<=POP_SIZE;i++){
            
        }}*/
   //constructeur
     //create a population
     public Population(int populationSize, boolean initialise)
     { individuals=new  Individual[populationSize];
     //initialise population
     if(initialise){
      //loop and create population
         
         for(int i=0;i<populationSize;i++){
         Individual newIndividual= new Individual();
      // newIndividual.generateIndividual2();
         saveIndividual(i, newIndividual);
         individuals[i]=newIndividual;
            }
         
     }
     
     }    
   //getters
    public Individual getIndividual(int index) {
        return individuals[index];
    }
 
    public void saveIndividual(int index, Individual indiv) {
        individuals[index] = indiv;
    }


       public int getPopulationSize() {
        return PopulationSize;
    }


   

    public Individual[] getIndividuals() {
        return individuals;
    }

    public void setIndividuals(Individual[] individuals) {
        this.individuals = individuals;
    }

    public int[][] getProcessingFactor() {
        return processingFactor;
    }

     public static double getMUTATION_RATE() {
        return MUTATION_RATE;
    }

    public static double getCROSSOVER_RATE() {
        return CROSSOVER_RATE;
    }

    public static int[][] getMatSizeDS() {
        return matSizeDS;
    }

    public static void setMatSizeDS(int[][] matSizeDS) {
        Population.matSizeDS = matSizeDS;
    }
     
     
   
    }
    
    
    
