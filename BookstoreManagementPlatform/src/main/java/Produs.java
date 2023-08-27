import java.math.BigDecimal;

public class Produs {
    private int id;
    private String nume;
    private BigDecimal pret;
    private int idCategorie;
    private int idAutor;

    public Produs(int id, String nume, BigDecimal pret, int idCategorie, int idAutor) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.idCategorie = idCategorie;
        this.idAutor = idAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public BigDecimal getPret() {
        return pret;
    }

    public void setPret(BigDecimal pret) {
        this.pret = pret;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
}
