public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
        Aluno a2 = new Aluno("Luigi", "Encanador", new Avaliacao(5,8,10));

        a1.info();
        a2.info();
    }
}
