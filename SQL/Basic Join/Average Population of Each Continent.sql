select COUNTRY.Continent, floor(avg(city.population))
from country, city
where country.code=city.countrycode
group by COUNTRY.Continent;