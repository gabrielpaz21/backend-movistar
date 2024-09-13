-- Users
INSERT INTO users (name,email,mobile_number) VALUES
('Juan','juan@example.com',04240000001),
('María','maria@example.com',04240000011),
('Ana','ana@example.com',04140000021),
('Carlos','carlos@example.com',04140000031),
('Luis','luis@example.com',04240000041);

-- Cupos for Juan (user_id = 1)
INSERT INTO cupos (mobile_number, balance, data, platform, cut_off_date, user_id) VALUES
(04240000001,100.00,10,'PREPAID','2024-12-31', 1),
(04240000002,150.00,15,'POSTPAID','2024-11-30', 1),
(04240000003,200.00,20,'PREPAID','2024-10-31', 1);

-- Cupos for María (user_id = 2)
INSERT INTO cupos (mobile_number, balance, data, platform, cut_off_date, user_id) VALUES
(04240000011,100.00,10,'PREPAID','2024-12-31',2),
(04240000012,150.00,15,'POSTPAID','2024-11-30',2),
(04240000013,200.00,20,'PREPAID','2024-10-31',2);

-- Cupos for Ana (user_id = 3)
INSERT INTO cupos (mobile_number, balance, data, platform, cut_off_date, user_id) VALUES
(04140000021,100.00,10,'POSTPAID','2024-12-31',3),
(04140000022,150.00,15,'PREPAID','2024-11-30',3),
(04140000023,200.00,20,'POSTPAID','2024-10-31',3);

-- Cupos for Carlos (user_id = 4)
INSERT INTO cupos (mobile_number,balance, data, platform, cut_off_date, user_id) VALUES
(04140000031, 100.00, 10, 'PREPAID', '2024-12-31', 4),
(04140000032, 150.00, 15, 'POSTPAID', '2024-11-30', 4),
(04140000033, 200.00, 20, 'PREPAID', '2024-10-31', 4);

-- Cupos for Luis (user_id = 5)
INSERT INTO cupos (mobile_number, balance, data, platform, cut_off_date, user_id) VALUES
(04240000041, 100.00, 10, 'POSTPAID', '2024-12-31', 5),
(04240000042, 150.00, 15, 'PREPAID', '2024-11-30', 5),
(04240000043, 200.00, 20, 'POSTPAID', '2024-10-31', 5);