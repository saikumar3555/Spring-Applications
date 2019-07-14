
--Queries to insert sample data into USERS TABLE
INSERT INTO users(username,password,enabled) VALUES ('Ashok','123456', true);
INSERT INTO users(username,password,enabled) VALUES ('Smith','456789', true);

--Queries to insert sample data into USER_ROLES TABLE
INSERT INTO user_roles (username, role) VALUES ('Ashok', 'ROLE_USER');
INSERT INTO user_roles (username, role)  VALUES ('Ashok', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role)  VALUES ('Smith', 'ROLE_USER');