package pl.coreservices.bootcamp.tddlibs.nbp;

public class ExchangeModel {

	String name;
	String code;
	int base;
	double avg;

	public ExchangeModel(String name, String code, int base, double avg) {
		this.name = name;
		this.code = code;
		this.base = base;
		this.avg = avg;
	}
}
