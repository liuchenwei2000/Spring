CREATE
    TABLE book
    (
    	isbn VARCHAR(100) NOT NULL,
        name VARCHAR(255) NOT NULL,
        author VARCHAR(255),
        PRIMARY KEY (isbn)
    )