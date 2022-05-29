package y.repository;

import liquibase.pro.packaged.C;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import y.domain.Country;

import java.util.List;

/**
 * Spring Data SQL repository for the Country entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findCountryByCountryName(String name);


}

