package pl.coreservices.bootcamp.tddlibs.nbp;

public class ExchangeCalculatorImpl implements ExchangeCalculator {

	private final TableAClient tableAClient;

	public ExchangeCalculatorImpl(TableAClient tableAClient) {
		this.tableAClient = tableAClient;
	}

	@Override
	public double calculate(double pln, String code) {
		return tableAClient.lastA().stream()
				.filter(em -> em.code.equals(code))
				.map(em -> em.avg * pln)
				.mapToDouble(Double::doubleValue)
				.findFirst()
				.getAsDouble();
	}
}
