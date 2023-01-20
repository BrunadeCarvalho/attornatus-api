INSERT INTO client (id, birth_date, name)VALUES
(1l, '01/02/1996', 'Maria Valentina'),
(2l, '01/02/1991', 'Enzo Gabriel');

INSERT INTO address (id, logradouro, city, main, number, zip_code, client_id)VALUES
(1l, 'Rua da felicidade', 'Rio de Janeiro', true, 23, '76432890', '1'),
(2l, 'Rua da alegria ', 'Florianopolis', true, 20, '51472392', '2');