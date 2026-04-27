import java.util.Scanner;


public class IMC {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("quelle est votre poids : ");
        float poids = sc.nextFloat();
        System.out.println("quelle est votre taille : ");
        float taille = sc.nextFloat()/100;
        double tailleCarre = Math.pow(taille, 2);

        double imc  = poids / tailleCarre;
        System.out.println("votre imc est de "+ imc);
        if (imc<18.5){
            System.out.println("vous etes en état de Maigreur");
        }
        else if (imc>18.5 && imc<25) {
            System.out.println("vous etes normal");
        }
        else if (imc>25 && imc<30) {
            System.out.println("vous etes en surpoids");
        }
        else{
            System.out.println("vous etes en état d'obésité");
        }



        sc.close();


    }



}

