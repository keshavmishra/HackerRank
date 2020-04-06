select listagg(prime_number,'&') within group(order by prime_number) as numbers
FROM(    
    select l prime_number
from (select level l from dual connect by level <= 1000)
, (select level m from dual connect by level <= 1000)
where m<=l
group by l
having count(case l/m when trunc(l/m) then 'Y' end) = 2);