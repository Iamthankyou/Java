
SELECT * FROM quanlysinhvien.subject
WHERE credit = (SELECT MAX(Credit) FROM subject)

SELECT * FROM student AS st
JOIN mark AS m ON st.StudentId = m.StudentId
WHERE mark = (SELECT MAX(Mark) FROM mark)

SELECT st.StudentId, st.StudentName, st.Address, st.Phone, st.Status, st.ClassId, AVG(Mark) FROM student AS st
JOIN mark AS m ON st.StudentId = m.StudentId
GROUP BY st.StudentId