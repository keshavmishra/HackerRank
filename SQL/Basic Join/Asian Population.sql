select sum(city.population)
from country, city
where country.code=city.countrycode and country.continent='Asia';