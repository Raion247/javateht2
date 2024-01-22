package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hedgehog newHedgehog = new Hedgehog("Pikseli", 5);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String speak = sc.nextLine();
                        if (speak.length() == 0) {
                            System.out.println("Olen " + newHedgehog.name + " ja ikäni on " + newHedgehog.age + " vuotta, mutta antaisitko silti syötteen?");
                        }
                        else {
                            System.out.println(newHedgehog.name + ": " + speak); 
                        }
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä:");
                        String myAge = sc.nextLine();
                        int age = Integer.parseInt(myAge);

                        newHedgehog = new Hedgehog(name, age);
                        break;
                    case 3:
                        int x = 0;
                        System.out.println("Kuinka monta kierrosta?");
                        int round = Integer.parseInt(sc.nextLine());
                        while (x<round) {
                            System.out.println(newHedgehog.name + " juoksee kovaa vauhtia!");
                            x++;
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
	}

}
