package com.ldh.weka.ProyectoFinal_LDH;

import java.io.File;
import java.util.Random;

import weka.classifiers.evaluation.*;
import weka.clusterers.*;
import weka.core.Instances;
import weka.core.converters.ArffLoader;

/**
 * Apply KMeans from Weka to the data set
 * @author HilarioJ
 *
 */
public class KMeans {
	
	public KMeans(File file_data) {
		Instances trainIns = null;
		KMeans k_means;
		try{
			ArffLoader loader = new ArffLoader();
			
			loader.setFile(file_data);
			trainIns = loader.getDataSet();
			
			trainIns.setClassIndex(trainIns.numAttributes()-1);
			k_means = (KMeans)Class.forName("weka.clusterers.SimpleKMeans").newInstance();
			kmeans.buildClassifier(trainIns);
			eval = new Evaluation(trainIns);
			eval.crossValidateModel(kmeans, trainIns, 10, new Random(1));
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
}

