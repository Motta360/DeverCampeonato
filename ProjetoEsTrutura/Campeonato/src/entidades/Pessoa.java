
package entidades;

public class Pessoa {
    protected String name;
    protected Character sex;

    public Pessoa() {
    }

    public Pessoa(String name, Character sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Nome=" + name + ", sexo=" + sex ;
    }
    
    
}
