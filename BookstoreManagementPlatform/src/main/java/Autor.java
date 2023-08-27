import java.util.Date;

public class Autor {
    private int id;
    private String nume;
    private Date dataNasterii;
    private String nationalitate;

    public Autor(int id, String nume, Date dataNasterii, String nationalitate) {
        this.id = id;
        this.nume = nume;
        this.dataNasterii = dataNasterii;
        this.nationalitate = nationalitate;
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

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getNationalitate() {
        return nationalitate;
    }

    public void setNationalitate(String nationalitate) {
        this.nationalitate = nationalitate;
    }
}
