import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Calculo do IMC (índice de massa corporal)
        // para o calculo do IMC é preciso do peso (em kilos) e da altura (metros)
        float imc, peso, altura;
        System.out.println("Vamos verificar o seu IMC");
        System.out.print("Insira a sua altura (em metros): ");
        altura = scanner.nextFloat();
        System.out.print("Insira o seu peso (em kg): ");
        peso = scanner.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("IMC = " + imc + "kg/m².");
        if (imc < 16) {//abaixo de 16 kg/m²
            System.out.println("Abaixo do peso, estado muito grave");
        } else {
            if (imc < 17){//entre 16 e 16,99 kg/m²
                System.out.println("Abaixo do peso, estado grave");
            } else {
                if (imc < 18.5){//entre 17 e 18,49 kg/m²
                    System.out.println("Abaixo do peso");
                } else {
                    if (imc < 25){//entre 18,50 e 24,99 kg/m²
                        System.out.println("Peso normal");
                    } else {
                        if (imc < 30){//entre 25 e 29,99 kg/m²
                            System.out.println("Sobrepeso");
                        } else {
                            if (imc < 35){//entre 30 e 34,99 kg/m²
                                System.out.println("Obesidade grau I");
                            } else {
                                if (imc < 40){//entre 35 e 39,99 kg/m²
                                    System.out.println("Obesidade grau II");
                                } else {//maior que 40 kg/m²
                                    System.out.println("Obesidade grau III (obesidade mórbida)");
                                }
                            }
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}