package com.stem.neuralnetwork;

import org.neuroph.core.Layer;
import org.neuroph.core.Neuron;
import org.neuroph.core.input.WeightedSum;
import org.neuroph.core.transfer.Sigmoid;
import org.neuroph.nnet.ConvolutionalNetwork;

public class Main {

	public static void main(String[] args) {
		
		ConvolutionalNetwork network = new ConvolutionalNetwork();
		
		for (int i = 0; i < 3; i++) {
			Layer layer = new Layer();
			
			for (int j = 0; j < 5; j++) {
				Neuron neuron = new Neuron();
				neuron.setInputFunction(new WeightedSum());
				neuron.setTransferFunction(new Sigmoid());
				layer.addNeuron(neuron);
			}
			network.addLayer(layer);
		}
	}

}

