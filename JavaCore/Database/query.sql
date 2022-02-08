USE QuanLySinhVien;

SELECT * FROM Student WHERE StudentName LIKE 'h%';

SELECT * FROM  class WHERE MONTH(StartDate) = 12;

SELECT * FROM Subject WHERE credit BETWEEN 3 AND 5;

UPDATE Student SET classid = 2 WHERE StudentName = 'Hung'

SELECT StudentName, S.Subname, M.Mark FROM MARK AS M
JOIN Subject AS S ON M.SubID = S.SubID
JOIN Student St ON M.StudentID = St.StudentID
ORDER BY Mark DESC, St.StudentName ASC