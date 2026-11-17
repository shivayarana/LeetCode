CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
CURSOR C IS SELECT   DISTINCT SALARY  FROM EMPLOYEE ORDER BY SALARY DESC;
COUNTER NUMBER := N;

BEGIN
    /* Write your PL/SQL query statement below */
    IF COUNTER <= 0 THEN
       RETURN NULL;
    END IF;
     OPEN C;
     LOOP
       FETCH C INTO result;
       EXIT WHEN C%NOTFOUND ;
        COUNTER := COUNTER - 1;
       EXIT WHEN COUNTER = 0;
       END LOOP;
        CLOSE C;

       IF( COUNTER > 0) THEN
          RETURN NULL;
        END IF;
  
    RETURN result;
END;