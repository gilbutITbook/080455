SELECT userName
FROM user
WHERE userId IN (SELECT userId FROM order WHERE age < 30);
