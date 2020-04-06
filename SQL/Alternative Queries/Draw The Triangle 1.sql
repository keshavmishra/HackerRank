select rpad('* ',42- level*2,'* ')
from dual 
connect by level <=20;