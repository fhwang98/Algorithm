SELECT SUM(g.score) score, e.emp_no, e.emp_name, e.position, e.email
FROM hr_employees e
INNER JOIN hr_grade g
ON e.emp_no = g.emp_no
GROUP BY e.emp_no
ORDER BY SUM(score) DESC
LIMIT 1