public class Lutador {
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Float altura;
    private Float peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;


    public void apresentar(){
        System.out.println("------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("vindo diretamente de " + this.getNacionalidade());
        System.out.println("Com  " + this.getIdade() + " anos de idade");
        System.out.println(this.getAltura() + " de altura");
        System.out.println("Pesando " + this.getPeso() + " quilos");
        System.out.println("Possui " + this.getVitorias() + " vitórias");
        System.out.println("Tendo " + this.getDerrotas() + " derrotas");
        System.out.println("E " + this.getEmpates() + " empates");
    }
    public void status(){
        System.out.println(getNome() + " é um peso " + getCategoria());
        System.out.println("Genhou " + getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public Lutador(String no, String na, Integer id, Float al,
                   Float pe, Integer de, Integer em, Integer vi) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.derrotas = de;
        this.empates = em;
        this.vitorias = vi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if(this.peso < 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }
}
