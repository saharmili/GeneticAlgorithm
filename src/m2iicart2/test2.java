/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iicart2;

import static m2iicart2.Population.PopulationSize;


/**
 *
 * @author Dell
 */
class test2{
 public static void main(String[] args) {
//         int LnbrDC=5;
//         int NnbrDS=10;
//         int MnbrC=8;
        int [][]capDC= new int[1][Population.MnbrC];
        int [][] sizeDS= new int [1][Population.NnbrDS];
        
        System.out.println("popSize "+Population.PopulationSize);
        Population p= new Population(Population.PopulationSize, true);
        
        for(int i=0;i<Population.PopulationSize;i++){
           // System.out.println(""+p.individuals[i].processingFactor);
            
            System.out.println("individu "+i+"est de fitness "+p.individuals[i].getFitness(p.individuals[i]));
            
        }
 
     
 }}