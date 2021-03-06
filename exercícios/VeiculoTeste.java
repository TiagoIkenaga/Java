public class VeiculoTeste {    
    public static void main(String[] args) {
        criandoObjetos();
        System.out.println("--------------------------");
        
        destruindoObjetos();
        System.out.println("--------------------------");
        
        exemploEstatico();
        System.out.println("--------------------------");
    }
    public static void criandoObjetos() {
        Veiculo carro1 = new Veiculo(0, 1010);
        System.out.println("Série: "+ carro1.numeroDeSerie);

        Veiculo carro2 = new Veiculo();
        for (int i=0; i<10; i++) {
            carro2.acelerar(10.0f);
            System.out.println("Velocidade do Carro2: "+ carro2.velocidadeAtual+"km/h");
        }// acelerar
        System.out.println("Velocidade do Carro1: "+ carro1.velocidadeAtual+"km/h");
    }
    public static void destruindoObjetos() {
        Veiculo carro1 = new Veiculo();
        carro1.numeroDeSerie = 1;
        Veiculo carro2 = new Veiculo();
        carro2.numeroDeSerie = 2;
        System.out.println("Serial Carro1: "+carro1.numeroDeSerie);
        System.out.println("Serial Carro2: "+carro2.numeroDeSerie);

        carro1 = carro2;
        System.out.println("A instancia originalmente indicada por carro1 pode ser destruida, não há referencias.");

        carro2.numeroDeSerie = 20;
        System.out.println("Serial Carro1: "+carro1.numeroDeSerie);
        System.out.println("Serial Carro2: "+carro2.numeroDeSerie);

        carro2 = null;
        System.out.println("Serial Carro1: "+carro1.numeroDeSerie);
        if (carro2 == null) {
            System.out.println("Referencia Carro2 é nula");
        }
        carro1 = null;
        System.out.println("A instancia originalmente indicada por carro2 pode ser destruida, não há referencias.");        
    }
    public static void exemploEstatico() {
        System.out.println("Classe: "+ Veiculo.metodoEstatico());

        // Veiculo carro = new Veiculo();
        System.out.println("Instância: "+ Veiculo.metodoEstatico());

        Veiculo.atributoEstatico = 5;
        System.out.println("Instância: "+ Veiculo.metodoEstatico());

        // Veiculo novoCarro = new Veiculo();
        System.out.println("Instância (NC): "+ Veiculo.metodoEstatico());
    }
}
