package com.example;

public interface ICalculadora {

	double suma(double o1, double o2);

	double avg(double o1, double o2, double... resto);

	double avg(int o1, int o2, int... resto);

	double avg(int o1, int o2, int o3);

}