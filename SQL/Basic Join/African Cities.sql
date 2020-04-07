select city.name
from country, city
where country.code=city.countrycode and country.continent='Africa';