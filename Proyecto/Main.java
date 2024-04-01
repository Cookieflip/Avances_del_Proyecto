import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        int opcion = 0, opcion1 = 0, opcion2 = 0, opcion3 = 0, nodo = 0, nodoInformacion = 0, valor = 0, posicion = 0;
        CodigoPilas pila = new CodigoPilas();
        CodigoColas cola = new CodigoColas();
        CodigoListasEnlazadas lista = new CodigoListasEnlazadas();

        //Menu Principal.
        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu Principal\n\n"
                        + "Elija el tipo de estructura de datos que quiere aplicar:\n"
                        + "1. Listas Enlazadas.\n"
                        + "2. Colas.\n"
                        + "3. Pilas.\n"
                        + "4. Salir.\n"));
                
                switch (opcion) {

                    //Menu para Listas Enlazadas.
                    case 1:
                        do{
                            try{
                                opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Menu de opciones\n\n"
                                + "1. Insertar Nodo al inicio\n"
                                + "2. Insertar Nodo en posicion.\n"
                                + "3. Insertar Nodo al final.\n"
                                + "4. ¿Cuantos Nodos existen?\n"
                                + "5. Mostrar Nodos\n"
                                + "6. Eliminar Nodo al inicio\n"
                                + "7. Eliminar Nodo al final\n"
                                + "8. Eliminar Nodo en posicion\n"
                                + "9. Regresar al menu prncipal.\n"));
                                switch(opcion1){
                                    case 1:
                                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo."));
                                    lista.InsertarAlInicio(valor);
                                    break;

                                    case 2:
                                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo."));
                                    lista.InsertarEnPosicion(posicion, valor);
                                    break;

                                    case 3:
                                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo."));
                                    lista.InsertarAlFinal(valor);
                                    break;

                                    case 4:
                                    JOptionPane.showMessageDialog(null, lista.ContarNodos());
                                    break;

                                    case 5:
                                    
                                    break;

                                }
                            } catch (NumberFormatException e) {

                            }
                        }while (opcion1 != 9);
                    break;

                    //Menu para las Colas.    
                    case 2:
                        do{
                            try{
                                opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Menú de Opciones\n\n"
                                + "1. Insertar un Nodo.\n"
                                + "2. Eliminar un Nodo.\n"
                                + "3. Mostrar contenido de la Cola.\n"
                                + "4. Regresar al menu principal.\n"));
                                switch(opcion2){
                                    case 1:
                                    nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del Nodo."));
                                    cola.Insertar(nodoInformacion);
                                    break;

                                    case 2:
                                    if (!cola.ColaVacia()) {
                                        JOptionPane.showMessageDialog(null, "Se extrajo un Nodo con el valor: "+cola.Extraer());
                                    } else {
                                        JOptionPane.showMessageDialog(null, "La Cola esta vacia.");
                                    }

                                    break;

                                    case 3:
                                    if(!cola.ColaVacia()){
                                        cola.MostrarContenido();
                                    }else{
                                        JOptionPane.showMessageDialog(null, "La Cola esta vacia.");
                                    }    
                                    break;

                                    case 4:
                                    opcion2 = 4;
                                    break;

                                    default:
                                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, intenta de nuevo.");
                                    break;
                                }

                            } catch (NumberFormatException e) {

                            }
                        }while (opcion2 != 4);
                    break;   
                    
                    //Menu para las Pilas.
                    case 3:
                        do{
                            try{
                                opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Menú de Opciones\n\n"
                                + "1. Insertar un nodo\n"
                                + "2. Eliminar un nodo\n"
                                + "3. ¿La Pila esta vacia?\n"
                                + "4. ¿Cual es el último valor ingresado en la Pila?\n"
                                + "5. ¿Cuantos nodos tiene la pila?\n"
                                + "6. Vaciar Pila\n"
                                + "7. Mostrar contenido de la Pila\n"
                                + "8. Regresar al menu principal.\n\n"));
                                switch(opcion3){
                                    case 1:
                                    nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa e valor a guardar del nodo"));
                                    pila.InsertarNodo(nodo);
                                    break;
                                    
                                    case 2:
                                    if(!pila.PilaVacia()){
                                        JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "+pila.EliminarNodo());

                                    }else{
                                        JOptionPane.showMessageDialog(null, "La pila está vacia.");
                                    }
                                    break;

                                    case 3:
                                    if(pila.PilaVacia()){
                                        JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                    }else{
                                        JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                                    }
                                    break;

                                    case 4:
                                    if(!pila.PilaVacia()){
                                        JOptionPane.showMessageDialog(null, "El ultimo valor ingresado de la pila es: "+pila.MostrarUltimoValorIngresado());
                                    }else{
                                        JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                    }
                                    break;

                                    case 5:
                                    JOptionPane.showMessageDialog(null, "La pila contiene: "+pila.TamanoPila()+ " nodos");
                                    break;

                                    case 6:
                                    if(!pila.PilaVacia()){
                                        pila.VaciarPila();
                                        JOptionPane.showMessageDialog(null, "Se ha vaciado la pila");

                                    }else{
                                        JOptionPane.showMessageDialog(null, "La pila esta vacia");
                                    }
                                    break;

                                    case 7:
                                    pila.MostrarValores();
                                    break;

                                    case 8:
                                    opcion3 = 8;
                                    break;

                                    default:
                                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, intenta de nuevo.");
                                    break;

                                }
                            } catch (NumberFormatException e) {

                            }
                        }while (opcion3 != 8);
                    break;
                        
                    case 4:
                        opcion = 4;
                    break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, intenta de nuevo.");
                    break;
                }
                

            } catch (NumberFormatException e) {

            }
        } while (opcion != 4);
    }
}
