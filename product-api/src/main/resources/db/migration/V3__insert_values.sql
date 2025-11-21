
-- Categories
INSERT INTO products.category(id, nome) VALUES(1, 'Eletrônico');
INSERT INTO products.category(id, nome) VALUES(2, 'Móveis');
INSERT INTO products.category(id, nome) VALUES(3, 'Brinquedos');
INSERT INTO products.category(id, nome) VALUES(4, 'Eletrodomésticos');
INSERT INTO products.category(id, nome) VALUES(5, 'Sportes');

-- Products
INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0001', 'Laptop Gamer X', 'Laptop com 16GB RAM, SSD 512GB', 4500.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0001');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0002', 'Smartphone Pro', 'Tela 6.5\", 128GB, câmera 48MP', 3500.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0002');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0003', 'Smart TV 55', 'TV 55\" 4K UHD', 3200.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0003');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0004', 'Headphones Noise', 'Fone com cancelamento de ruído', 450.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0004');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0005', 'Monitor 27', 'Monitor 27\" IPS 144Hz', 1200.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0005');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0006', 'Tablet 10', 'Tablet 10\" 64GB', 900.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0006');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0007', 'SSD 1TB', 'SSD NVMe 1TB', 800.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0007');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0008', 'Webcam HD', 'Webcam 1080p com microfone', 150.00, 1
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0008');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0009', 'Sofá 3 Lugares', 'Sofá estofado 3 lugares', 1500.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0009');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0010', 'Mesa Jantar 6 Lugares', 'Mesa de jantar em madeira', 1200.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0010');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0011', 'Cadeira Escritório', 'Cadeira ergonômica com rodízios', 300.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0011');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0012', 'Cama Casal', 'Cama casal com estrado', 900.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0012');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0013', 'Estante Modular', 'Estante modular em MDF', 650.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0013');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0014', 'Escrivaninha Office', 'Escrivaninha com gavetas', 400.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0014');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0015', 'Rack TV 60', 'Rack para TV até 60\"', 550.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0015');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0016', 'Poltrona Reclinável', 'Poltrona reclinável em tecido', 800.00, 2
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0016');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0017', 'Quebra-Cabeça 1000pcs', 'Quebra-cabeça 1000 peças', 80.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0017');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0018', 'Boneca Fashion', 'Boneca articulada com roupas', 120.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0018');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0019', 'Carrinho Controle', 'Carrinho RC com controle remoto', 200.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0019');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0020', 'Jogo Tabuleiro', 'Jogo de tabuleiro família', 90.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0020');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0021', 'Pelúcia Grande', 'Pelúcia macia tamanho grande', 70.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0021');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0022', 'Kit Lego 300pcs', 'Kit de construção 300 peças', 250.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0022');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0023', 'Puzzle 500pcs', 'Quebra-cabeça 500 peças', 45.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0023');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0024', 'Jogo Educativo', 'Brinquedo educativo STEM', 130.00, 3
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0024');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0025', 'Geladeira Duplex', 'Geladeira duplex frost free', 2800.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0025');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0026', 'Fogão 5 Bocas', 'Fogão 5 bocas inox', 1100.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0026');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0027', 'Micro-ondas 30L', 'Micro-ondas 30 litros', 600.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0027');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0028', 'Máquina Lavar 10kg', 'Máquina de lavar 10kg automática', 1800.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0028');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0029', 'Liquidificador Potente', 'Liquidificador 1200W', 220.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0029');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0030', 'Cafeteira Expresso', 'Cafeteira expresso automática', 550.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0030');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0031', 'Purificador Água', 'Purificador de água residencial', 700.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0031');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0032', 'Aspirador Robô', 'Aspirador robô com mapeamento', 1500.00, 4
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0032');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0033', 'Bicicleta Aro 29', 'Bicicleta mountain bike aro 29', 2200.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0033');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0034', 'Esteira Elétrica', 'Esteira elétrica com inclinação', 2500.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0034');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0035', 'Halteres 20kg', 'Par de halteres 20kg', 350.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0035');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0036', 'Bola Futebol Oficial', 'Bola de futebol tamanho 5', 120.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0036');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0037', 'Skate Street', 'Skate completo street', 300.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0037');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0038', 'Raquete Tênis Prof', 'Raquete de tênis profissional', 600.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0038');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0039', 'Mochila Trilhas', 'Mochila para trilhas e esportes', 220.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0039');

INSERT INTO products.product (product_identifier, nome, descricao, preco, category_id)
SELECT 'PROD-0040', 'Capacete Ciclismo', 'Capacete de ciclismo com viseira', 180.00, 5
WHERE NOT EXISTS (SELECT 1 FROM products.product WHERE product_identifier = 'PROD-0040');
