package pl.coreservices.bootcamp.tddlibs.nbp;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ExchangeCalculatorTest {

	private ExchangeCalculator sut;

	protected

	@BeforeEach
	void setUp() {
		TableAClient tableAClient = Mockito.mock(TableAClient.class);
		Mockito.when(tableAClient.lastA())
				.thenAnswer((Answer<Collection<ExchangeModel>>) i -> {
					List<ExchangeModel> list = new ArrayList<>();
					list.add(new ExchangeModel("Dolar", "USD", 1, 1.0));
					return list;
				});
		sut = new ExchangeCalculatorImpl(tableAClient);
	}


	@Test
	void shouldReturnFor1Usd() {
		double usd = sut.calculate(1.0, "USD");
		Assertions.assertThat(usd).isEqualTo(1.0, Offset.offset(0.01));
	}
}