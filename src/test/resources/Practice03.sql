select * from employees;
-- 1. FIND OUT COUNTRY NAME AND REGION NAME FROM COUNTRIES AND REGION TABLE

select country_name, REGION_NAME
from COUNTRIES c inner join REGIONS r on c.REGION_ID = r.REGION_ID;


-- 2. FIND OUT FIRST_NAME AND JOB_TITLE FROM JOBS AND EMPLOYEES TABLE
select FIRST_NAME,JOB_TITLE
from EMPLOYEES e join JOBS J on e.JOB_ID = J.JOB_ID;

-- 3. FIND OUT DEPARTMENT_NAME AND CITY


-- 4. FIND OUT ALL CITIES  AND COUNTRY NAMES


-- 5. FIND OUT FIRST_NAME, LAST NAME, DEPARTMENT ID , DEPARTMENT NAME  FOR DEPARTMENT ID 80 OR 40


-- 6. FIND OUT CITY , COUNTRY_NAME OF THAT CITY , REGION_NAME OF THAT CITY


--  7. FIND OUT EMPLOYEES FIRST_NAME , JOB_TITLE , DEPARTMENT_NAME , CITY


-- 8. FIND OUT EMPLOYEES FIRST_NAME , JOB_TITLE , DEPARTMENT_NAME , CITY , COUNTRY_NAME , REGION_NAME





--9. FIND OUR  EMPLOYEES FIRST_NAME, LAST NAME, DEPARTMENT ID AND ALL DEPARTMENTS
--  INCLUDING  WHERE DO NOT HAVE ANY EMPLOYEE.



--10. FIND OUT ALL DEPARTMENT_NAME  , LOCATION_ID , AND COUNTRY_ID
-- INCLUDING THOSE LOCATIONS  WITH NO DEPARTMENT


--11.FIND OUT DEPARTMENT_NAME , LOCATION_ID , AND COUNTRY_NAME
-- INCLUDING THOSE COUNTRIES WITH NO DEPARTMENT



--12. FIND OUT EMPLOYEES FIRST_NAME, DEPARTMENT ID AND DEPARTMENT NAME
-- INCLUDING THOSE DOES NOT HAVE DEPARTMENT
-- INCLUDING THOSE DEPARTMENTS  DOES NOT HAVE ANY MATCHING EMPLOYEES