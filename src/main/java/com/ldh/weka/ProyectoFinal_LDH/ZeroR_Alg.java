package com.ldh.weka.ProyectoFinal_LDH;

import java.io.File;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.rules.ZeroR;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Apply ZeroR from weka to the data set
 * @author Miguel Aurelio Garcia Gonzalez
 */
public class ZeroR_Alg {

	public String resultado;
	
	/**
	 * class constructor 
	 * @param file from datasheet
	 */
	public ZeroR_Alg(File file_data) {
			
				Instances trainIns = null;
				ZeroR z;
				
				try	{
			          
			           
					   ArffLoader loader = new ArffLoader();
			           
			           loader.setFile(file_data);
			           trainIns = loader.getDataSet();
			          
			           
			           trainIns.setClassIndex(trainIns.numAttributes()-1);
			           
			           z = (ZeroR)Class.forName("weka.classifiers.rules.ZeroR").newInstance();
			           
			           z.buildClassifier(trainIns);
			           
			           Evaluation eval = new Evaluation(trainIns);
			           eval.crossValidateModel(z, trainIns, 10, new Random(1));
			           
			           
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
