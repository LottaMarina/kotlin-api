CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
    );

INSERT INTO product (name, price) VALUES
    ('Product A', 19.99),
    ('Product B', 29.99),
    ('Product C', 39.99);