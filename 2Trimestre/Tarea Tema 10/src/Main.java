public class Main {
    public static void main (String[] args) throws PersonaNotFound{

        Mundial m2022 = new Mundial(1, 2022);
    
    SeleccionFutbol Esp2022 = new SeleccionFutbol(1, "España", m2022, null, null);
    SeleccionFutbol Arg2022 = new SeleccionFutbol(2, "Argentina", m2022, null, null);
    
    m2022.asignarSeleccion(Esp2022);
    m2022.asignarSeleccion(Arg2022);

/*Integrantes España */

   /*  Futbolista Ej1 = new Futbolista(1, "N1", "A1", "14/05/98", 80, 1.8, 1, "Portero");
    Futbolista Ej2 = new Futbolista(2, "N2", "A2", "14/05/98", 80, 1.8, 2, "L-izq");
    Futbolista Ej3 = new Futbolista(3, "N3", "A3", "14/05/98", 50, 1.8, 3, "L-der");
    Futbolista Ej4 = new Futbolista(4, "N4", "A4", "14/05/98", 80, 1.8, 4, "C-Izq");
    Futbolista Ej5 = new Futbolista(5, "N5", "A5", "14/05/98", 80, 1.8, 5, "C-der");
    Futbolista Ej6 = new Futbolista(6, "N6", "A6", "14/05/98", 80, 1.8, 6, "Ex-izq");
    Futbolista Ej7 = new Futbolista(7, "N7", "A7", "14/05/98", 80, 1.8, 7, "Ex-der");
    Futbolista Ej8 = new Futbolista(8, "N8", "A8", "14/05/98", 80, 1.8, 8, "M-izq");
    Futbolista Ej9 = new Futbolista(9, "N9", "A9", "14/05/98", 80, 1.8, 9, "M-der");
    Futbolista Ej10 = new Futbolista(10, "N10", "A10", "14/05/98", 80, 1.8, 10, "D-der");
    Futbolista Ej11 = new Futbolista(11, "N11", "A11", "14/05/98", 80, 1.8, 9, "D-izq"); */

    Entrenador espEntrenador = new Entrenador(12, "Vicente", "Del Bosque", "1/1/1950", 27, 1.7, 1);
    Fisioterapeuta fisioEsp = new Fisioterapeuta(13, "fisioesp", "f2", null, 65, 1.8, null, 1);


/*Integrantes Argentina */

        /*  Futbolista Aj1 = new Futbolista(1, "N1", "A1", "14/05/98", 40, 1.8, 1, "Portero");
            Futbolista Aj2 = new Futbolista(2, "N2", "A2", "14/05/98", 50, 1.8, 2, "L-izq");
            Futbolista Aj3 = new Futbolista(3, "N3", "A3", "14/05/98", 70, 1.8, 3, "L-der");
            Futbolista Aj4 = new Futbolista(4, "N4", "A4", "14/05/98", 80, 1.8, 4, "C-Izq");
            Futbolista Aj5 = new Futbolista(5, "N5", "A5", "14/05/98", 80, 1.8, 5, "C-der");
            Futbolista Aj6 = new Futbolista(6, "N6", "A6", "14/05/98", 80, 1.8, 6, "Ex-izq");
            Futbolista Aj7 = new Futbolista(7, "N7", "A7", "14/05/98", 80, 1.8, 7, "Ex-der");
            Futbolista Aj8 = new Futbolista(8, "N8", "A8", "14/05/98", 20, 1.8, 8, "M-izq");
            Futbolista Aj9 = new Futbolista(9, "N9", "A9", "14/05/98", 50, 1.8, 9, "M-der");
            Futbolista Aj10 = new Futbolista(10, "N10", "A10", "14/05/98", 50, 1.8, 10, "D-der");
            Futbolista Aj11 = new Futbolista(11, "N11", "A11", "14/05/98", 80, 1.8, 9, "D-izq"); 
 */
/*No los creo para comprobacion de Excepcion*/
            /*Entrenador argEntrenador = new Entrenador(12, "Cholo", "simeone", "1/1/1950", 27, 1.7, 1); 
            Fisioterapeuta fisioArg = new Fisioterapeuta(13, "fisioasp", "f2", null, 65, 1.8, null, 1);*/



 /*Añadimos a la lista */ 

        /*Esp2022.añadirPersona(Ej11);
            Esp2022.añadirPersona(Ej10);
            Esp2022.añadirPersona(Ej9);
            Esp2022.añadirPersona(Ej8);
            Esp2022.añadirPersona(Ej7);
            Esp2022.añadirPersona(Ej6);
            Esp2022.añadirPersona(Ej5);
            Esp2022.añadirPersona(Ej4);
            Esp2022.añadirPersona(Ej3);
            Esp2022.añadirPersona(Ej2);
            Esp2022.añadirPersona(Ej1); */
            Esp2022.añadirPersona(espEntrenador); 
            Esp2022.añadirPersona(fisioEsp); 


        /* Arg2022.añadirPersona(Aj11);
            Arg2022.añadirPersona(Aj10);
            Arg2022.añadirPersona(Aj9);
            Arg2022.añadirPersona(Aj8);
            Arg2022.añadirPersona(Aj7);
            Arg2022.añadirPersona(Aj6);
            Arg2022.añadirPersona(Aj5);
            Arg2022.añadirPersona(Aj4);
            Arg2022.añadirPersona(Aj3);
            Arg2022.añadirPersona(Aj2);
            Arg2022.añadirPersona(Aj1); 
            Arg2022.añadirPersona(argEntrenador); 
            Arg2022.añadirPersona(fisioArg);  */

/*Prueba Tema 10 */

/*Recorro el arraylist de selecciones del mundial, comparo con la seleccion de la que quiero acceder a sus personas, si sale correcto, recorro la lista de personas de esa seleccion, comprobamos si hay una persona entrenador dentro de la lista de personas, hago un casteo de ese objeto persona a Entrenador y accedo a su metodo comer */ 

            /* for(SeleccionFutbol i : m2022.getSelecciones()) {
                    if(i == Arg2022) {
                        for(Persona j : i.getEquipos()) {
                            if(j instanceof Entrenador) {
                                ((Entrenador) j).comer();
                            }
                        }
                    }
                } */

/*Recorro el arraylist de selecciones del mundial, comparo con la seleccion de la que quiero acceder a sus personas, si sale correcto, recorro la lista de personas de esa seleccion, comprobamos si hay una persona Fisioterapeuta dentro de la lista de personas, hago un casteo de ese objeto persona a Fisioterapeuta y accedo a su metodo concentrarse */
            /* for(SeleccionFutbol l : m2022.getSelecciones()) {
                    if(l == Esp2022) {
                        for(Persona j : l.getEquipos()) {
                            if(j instanceof Fisioterapeuta) {
                                ((Fisioterapeuta) j).concentrarse();
                            }
                        }
                    }
                } */

/*Accedemos al metodo para mostrar todos los integrantes de las selecciones */
                Esp2022.listarIntegrantes();
                Arg2022.listarIntegrantes();

/*Recorro el arraylist de selecciones del mundial, comparo con la seleccion de la que quiero acceder a sus personas, si sale correcto, recorro la lista de personas de esa seleccion, comprobamos si hay una persona Futbolista dentro de la lista de personas, hago un casteo de ese objeto persona a Futbolista y accedo a su metodo para comprobar si tiene sobrepeso */  
               /* for(SeleccionFutbol p : m2022.getSelecciones()) {
                    if(p == Arg2022) {
                        for(Persona j : p.getEquipos()) {
                            if(j instanceof Futbolista) {
                                if(((Futbolista) j).tieneSobrepeso()){
                                    System.out.println("Tiene sobrepeso");
                                }                
                            }
                        }
                    }
                } */


/*Excepciones Tema 11*/
                    try {
                        Esp2022.getEntrenador();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
 
                    try {
                        Esp2022.getFisioterapeuta();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    try {
                        Arg2022.getEntrenador();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
 
                    try {
                        Arg2022.getFisioterapeuta();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }


    }
}
