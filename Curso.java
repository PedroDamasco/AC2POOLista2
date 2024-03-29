import java.util.ArrayList;

public class Curso {
	 private int codigo;
	    private String nome;
	    private int cargaHoraria;
	    private ArrayList<Aluno> alunos = new ArrayList<>();

	    public Curso() {
	    }
	    
	    public Curso(int codigo, String nome, int cargaHoraria) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.cargaHoraria = cargaHoraria;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getCargaHoraria() {
	      return cargaHoraria;
	    }

	    public void setCargaHoraria(int cargaHoraria) {
	      this.cargaHoraria = cargaHoraria;
	    }

	    public ArrayList<Aluno> getAlunos() {
	      return alunos;
	    }

	    public void setAlunos(Aluno aluno) {
	      this.alunos.add(aluno);
	    }
	  
	    public void inserirAluno(Aluno aluno){
	      this.alunos.add(aluno);
	    }
	    public void removerAluno(int index){
	      this.alunos.remove(index);
	    }
	    public String imprimir(){
	       return "Código: "+ this.codigo + "\n"+
	                "Nome: "+ this.nome + "\n" +
	                "Carga Horária: "+ this.cargaHoraria +"\n";
	    }
	    
	    public String imprimirCompleto(){
	        String retorno = imprimir();
	        for (Aluno aluno : alunos) {
	            retorno+= aluno.imprimir();
	        }
	        return retorno;
	    }
