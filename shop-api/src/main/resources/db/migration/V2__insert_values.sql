-- COMPRA 1: Joao Silva (CPF: 12345678901) - Maio, 3 itens eletronicos
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('12345678901', '2024-05-15 10:30:00', 4400.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (1, 'PROD-0002', 3500.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (1, 'PROD-0004', 450.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (1, 'PROD-0008', 150.00);

-- COMPRA 2: Mariana Costa (CPF: 23456789012) - Dezembro, 6 itens eletrodomesticos
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('23456789012', '2024-12-20 14:15:00', 5240.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0025', 2800.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0027', 600.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0029', 220.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0030', 550.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0031', 700.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (2, 'PROD-0026', 1100.00);

-- COMPRA 3: Carlos Pereira (CPF: 34567890123) - Fevereiro, 7 itens esportes
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('34567890123', '2024-02-10 09:45:00', 4920.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0033', 2200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0034', 2500.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0035', 350.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0036', 120.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0037', 300.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0039', 220.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (3, 'PROD-0040', 180.00);

-- COMPRA 4: Ana Oliveira (CPF: 45678901234) - Julho, 5 itens moveis
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('45678901234', '2024-07-25 16:20:00', 5450.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (4, 'PROD-0009', 1500.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (4, 'PROD-0010', 1200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (4, 'PROD-0012', 900.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (4, 'PROD-0015', 550.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (4, 'PROD-0016', 800.00);

-- COMPRA 5: Pedro Almeida (CPF: 56789012345) - Outubro, 9 itens brinquedos
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('56789012345', '2024-10-08 11:00:00', 1795.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0017', 80.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0018', 120.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0019', 200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0020', 90.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0021', 70.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0022', 250.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0023', 45.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0024', 130.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (5, 'PROD-0017', 80.00);

-- COMPRA 6: Joao Silva (CPF: 12345678901) - Setembro, 4 itens eletronicos premium
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('12345678901', '2024-09-03 13:30:00', 7500.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (6, 'PROD-0001', 4500.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (6, 'PROD-0005', 1200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (6, 'PROD-0003', 3200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (6, 'PROD-0006', 900.00);

-- COMPRA 7: Mariana Costa (CPF: 23456789012) - Marco, 3 itens
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('23456789012', '2024-03-17 15:45:00', 1320.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (7, 'PROD-0029', 220.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (7, 'PROD-0030', 550.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (7, 'PROD-0032', 1500.00);

-- COMPRA 8: Carlos Pereira (CPF: 34567890123) - Junho, 8 itens variados
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('34567890123', '2024-06-11 10:15:00', 8920.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0003', 3200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0006', 900.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0008', 150.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0035', 350.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0036', 120.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0037', 300.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0038', 600.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (8, 'PROD-0039', 220.00);

-- COMPRA 9: Ana Oliveira (CPF: 45678901234) - Novembro, 6 itens moveis
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('45678901234', '2024-11-22 12:00:00', 3200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0011', 300.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0013', 650.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0014', 400.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0016', 800.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0010', 1200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (9, 'PROD-0011', 300.00);

-- COMPRA 10: Pedro Almeida (CPF: 56789012345) - Abril, 10 itens diversos
INSERT INTO shops.shop (user_identifier, date, total) VALUES ('56789012345', '2024-04-19 17:30:00', 2565.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0018', 120.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0020', 90.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0023', 45.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0024', 130.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0017', 80.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0021', 70.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0022', 250.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0019', 200.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0018', 120.00);
INSERT INTO shops.item (shop_id, product_identifier, price) VALUES (10, 'PROD-0020', 90.00);