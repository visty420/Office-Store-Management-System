CREATE TABLE Categorii (
    id INT PRIMARY KEY,
    nume VARCHAR(100)
);

CREATE TABLE Autori (
    id INT PRIMARY KEY,
    nume VARCHAR(255),
    data_nasterii DATE,
    nationalitate VARCHAR(100)
);


CREATE TABLE Produse (
    id INT PRIMARY KEY,
    nume VARCHAR(255),
    pret DECIMAL(10, 2),
    id_categorie INT,
    id_autor INT,
    FOREIGN KEY (id_categorie) REFERENCES Categorii(id),
    FOREIGN KEY (id_autor) REFERENCES Autori(id)
);



