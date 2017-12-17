package com.ldh.weka.ProyectoFinal_LDH;

import java.io.File;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Apply RandomForest from weka to the data set
 * @author Miguel Aurelio Garcia Gonzalez
 */
public class RandomForest_Tree {

	public String resultado;
	
	/**
	 * class constructor 
	 * @param file from datasheet
	 */
	public RandomForest_Tree(File file_data) {
			
				Instances trainIns = null;
				RandomForest r;
				
				try	{
			          
			           
					   ArffLoader loader = new ArffLoader();
			           
			           loader.setFile(file_data);
			           trainIns = loader.getDataSet();
			          
			           
			           trainIns.setClassIndex(trainIns.numAttributes()-1);
			           
			           r = (RandomForest)Class.forName("weka.classifiers.trees.RandomForest").newInstance();
			           
			           r.buildClassifier(trainIns);
			           
			           Evaluation eval = new Evaluation(trainIns);
			           eval.crossValidateModel(r, trainIns, 10, new Random(1));
			           
			           
			              try {
			            	  resultado = "";
			                  resultado = eval.toClassDetailsString();
			                  resultado += "\n";
			                  resultado += eval.toCumulativeMarginDistributionString();
			                  resultado += "\n";
			                  resultado += eval.toSummaryString();
			                  resultado += "\n";
			                  resultado += eval.toMatrixString();
			                  resultado += "\n";
			                  
			            	  
			              } catch(Exception e) {
			            	  e.getMessage();
			              }
			              
			           
			} catch(Exception e) {
		        e.printStackTrace();
		    }
	}
	
}
