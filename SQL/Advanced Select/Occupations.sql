select doc,prof,singer,act
from ( select row_number() over(partition by Occupation order by Name) ron,Name as n,Occupation as o
from OCCUPATIONS ) pro
pivot
(max(n)
 for o in ('Doctor' as doc,'Actor' as act,'Professor' as prof,'Singer' as singer))
 order by ron asc;