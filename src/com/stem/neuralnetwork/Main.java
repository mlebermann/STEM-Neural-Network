package com.stem.neuralnetwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import org.neuroph.core.Layer;
import org.neuroph.core.Neuron;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.core.input.WeightedSum;
import org.neuroph.core.transfer.Sigmoid;
import org.neuroph.nnet.SupervisedHebbianNetwork;
import org.neuroph.util.TransferFunctionType;

public class Main {

	public static void main(String[] args) {
		
		GZIPInputStream gzipIn;
		
		byte[] buf = new byte[9912422];
		
		try {
			gzipIn = new GZIPInputStream(new FileInputStream("data/test-data/test-images.gz"));
			
			gzipIn.read(buf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < buf.length; i++) {
			System.out.println(buf[i]);
		}
		
//		SupervisedHebbianNetwork network = new SupervisedHebbianNetwork(785, 10, TransferFunctionType.SIGMOID);
//		
//		DataSet data = new DataSet(785, 10);
//		data.addRow(new DataSetRow());
//		
//		for (int i = 0; i < 3; i++) {
//			Layer layer = new Layer();
//			
//			for (int j = 0; j < 5; j++) {
//				Neuron neuron = new Neuron();
//				neuron.setInputFunction(new WeightedSum());
//				neuron.setTransferFunction(new Sigmoid());
//				layer.addNeuron(neuron);
//			}
//			network.addLayer(layer);
//		}
	}

}

