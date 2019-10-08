INSERT INTO post (id, author, text)
VALUES (1, 'Java Coder', 'Hey, do you know if this service the one from internship task?'),
       (2, 'Spring Master Wannabe', 'Oh, man it is quite difficult');

INSERT INTO comment (id, text, post_it)
VALUES (1, 'Yes, that is it', 1),
       (2, 'Confirmed info', 1),
       (3, 'Indeed.... Good luck!', 2);