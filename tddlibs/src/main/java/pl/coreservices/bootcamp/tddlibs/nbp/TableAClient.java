package pl.coreservices.bootcamp.tddlibs.nbp;

import java.time.LocalDate;
import java.util.Collection;

public interface TableAClient {

	Collection<ExchangeModel> lastA();
	Collection<ExchangeModel> forDate(LocalDate localDate);

}
