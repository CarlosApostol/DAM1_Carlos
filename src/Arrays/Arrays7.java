package Arrays;//Escribe una función que recoja una lista de cinco cadenas, una por línea, y las imprima en un marco rectangular

import java.util.Scanner;
public class Arrays7 {
        public static void main(String[] args){
                    String[] cad = new String[5];
                    Scanner inputValue = new Scanner(System.in);
                    int Cade;
                    int longitud = 0;
                    int alm;
                    String almo = "";
                    String esp = "";
                    System.out.println("Escribe tu texto: ");
                    int lon = 0;

                    for(int i = 0; i<cad.length;i++){
                        cad[i] = inputValue.next();
                        if(cad[i].length()>0){
                            longitud = cad[i].length();
                        }
                    }

                    for(int i = 0; i<longitud;i++){
                        almo = almo+"*";
                    }
                    alm = almo.length();
                    System.out.println("*"+almo+"*");
                    for(int i = 0; i<cad.length;i++){
                        Cade = cad[i].length();
                        for (int x = 0;x<(alm-Cade);x++){
                            esp = esp+" ";

                        }
                        if(cad[i].length()==alm){
                            System.out.println("*"+cad[i]+"*");
                        }else{
                            System.out.println("*"+cad[i]+esp+"*");
                        }
                        esp = "";
                    }
                    System.out.println("*"+almo+"*");
                }
            }


