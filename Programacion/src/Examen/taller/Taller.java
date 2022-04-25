/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen_2018_taller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author brc-9
 */
public class Taller {

    static String rutaFichero = "trabajos.dat";
    static ArrayList<Trabajo> trabajos = null;

    public static void main(String[] args) {
        leerArchivoBinario();
        recuperarUltimoIdentificador();

        int opcionMenu = menu();

        while (opcionMenu != 6) {
            switch (opcionMenu) {
                case 1:
                    nuevoTrabajo();
                    break;
                case 2:
                    anadirHoras();
                    break;
                case 3:
                    anadirMaterial();
                    break;
                case 4:
                    finalizarTrabajo();
                    break;
                case 5:
                    listarTrabajos();
                    break;
            }
            opcionMenu = menu();
        }

        escribirArchivoBinario();
    }

    private static void leerArchivoBinario() {
        File fichero = new File(rutaFichero);
        if (fichero.exists()) {
            ObjectInputStream objInputStream = null;
            try {
                objInputStream = new ObjectInputStream(new FileInputStream(fichero));
                trabajos = (ArrayList<Trabajo>) objInputStream.readObject();
            } catch (IOException e) {
                System.err.println("Error abriendo el fichero");
            } catch (ClassNotFoundException e) {
                System.err.println("Formato incorrecto de fichero");
            } finally {
                try {
                    if (objInputStream != null) {
                        objInputStream.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error cerrando el fichero");
                }
            }
        } else {
            trabajos = new ArrayList<Trabajo>();
        }
    }

    private static void escribirArchivoBinario() {
        File fichero = new File(rutaFichero);
        ObjectOutputStream objOutputStream = null;
        try {
            objOutputStream = new ObjectOutputStream(new FileOutputStream(fichero));
            objOutputStream.writeObject(trabajos);
        } catch (IOException e) {
            System.err.println("Error abriendo el fichero");
        } finally {
            try {
                if (objOutputStream != null) {
                    objOutputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error cerrando el fichero");
            }
        }
    }

    private static int menu() {
        String mensajeMenu = "1. Nuevo trabajo\n"
                + "2. Añadir horas \n"
                + "3. Añadir material \n"
                + "4. Finalizar trabajo y generar factura\n"
                + "5. Listar trabajos\n"
                + "6. Salir\n";
        int opcionMenu;
        opcionMenu = Teclado.leerEntero(mensajeMenu, 1, 6);
        return opcionMenu;
    }

    private static void nuevoTrabajo() {
        boolean respuestaValida = false;
        String descripcion = "";
        int trabajoElegido = tipoTrabajo();
        Trabajo trabajoNuevo = null;
        while (!respuestaValida) {
            switch (trabajoElegido) {
                case 1:
                    descripcion = Teclado.leerTexto("Indica una descripcion para el trabajo.");
                    trabajoNuevo = new RepMecanica(descripcion);
                    trabajos.add(trabajoNuevo);
                    respuestaValida = true;
                    break;
                case 2:
                    descripcion = Teclado.leerTexto("Indica una descripcion para el trabajo.");
                    trabajoNuevo = new RepChapaPintura(descripcion);
                    trabajos.add(trabajoNuevo);
                    respuestaValida = true;
                    break;
                case 3:
                    descripcion = Teclado.leerTexto("Indica una descripcion para el trabajo.");
                    trabajoNuevo = new Revision(descripcion);
                    trabajos.add(trabajoNuevo);
                    respuestaValida = true;
                    break;
            }
        }
    }

    private static void anadirHoras() {
        String id = preguntarID();
        int indiceEncontrado = comprobarID(id);
        int numeroHoras;
        if (indiceEncontrado != -1) {
            numeroHoras = Teclado.leerEntero("Indica el numero de horas a añadir");
            trabajos.get(indiceEncontrado).incrementarHoras(numeroHoras);
        }
    }

    private static void anadirMaterial() {
        String id = preguntarID();
        int indiceEncontrado = comprobarID(id);
        double precioMaterial;
        if (indiceEncontrado != -1) {
            precioMaterial = Teclado.leerDouble("Indica el importe del material a añadir");
            if (trabajos.get(indiceEncontrado) instanceof RepMecanica) {
                ((RepMecanica) trabajos.get(indiceEncontrado)).usarMaterial(precioMaterial);
            } else if (trabajos.get(indiceEncontrado) instanceof RepChapaPintura) {
                ((RepChapaPintura) trabajos.get(indiceEncontrado)).usarMaterial(precioMaterial);
            }
            trabajos.get(indiceEncontrado);
        }
    }

    private static void finalizarTrabajo() {
        String id = preguntarID();
        int indiceEncontrado = comprobarID(id);
        if (indiceEncontrado != -1) {
            trabajos.get(indiceEncontrado).setEstaFinalizado(true);
            generarFicheroTexto(trabajos.get(indiceEncontrado).getIdentidicadorTrabajo(), trabajos.get(indiceEncontrado).toString());
        }
    }

    private static void listarTrabajos() {
        for (Trabajo value : trabajos) {
            System.out.println(value.toString());
        }
    }

    private static int tipoTrabajo() {
        // 1 = Reparacion Mecanica, 2 = Reparacion Chapa Pintura 3 = Revision
        int trabajoElegido;
        String mensajeTipoTrabajo = "1 = Reparacion Mecanica\n"
                + "2 = Reparación Chapa Pintura\n"
                + "3 = Revision\n";
        trabajoElegido = Teclado.leerEntero(mensajeTipoTrabajo, 1, 3);
        return trabajoElegido;
    }

    private static String preguntarID() {
        String id;
        id = Teclado.leerTexto("Indica el ID del trabajo");
        return id;
    }

    private static int comprobarID(String id) {
        boolean noEstaEnListaOEstaFinalizado = false;
        for (int i = 0; i < trabajos.size(); i++) {
            if (trabajos.get(i).getIdentidicadorTrabajo().equals(id) && !trabajos.get(i).isEstaFinalizado()) {
                return i;
            } else {
                noEstaEnListaOEstaFinalizado = true;

            }
        }
        if (noEstaEnListaOEstaFinalizado) {
            System.out.println("El identificador no esta en la lista o el trabajo esta finalizado.");
        }
        return -1;
    }

    private static void generarFicheroTexto(String rutaFichero, String informacionAEscribir) {
        File ficheroTexto = new File(rutaFichero);
        BufferedWriter buffWriter = null;
        try {
            buffWriter = new BufferedWriter(new FileWriter(ficheroTexto));
            buffWriter.write(informacionAEscribir);
        } catch (IOException e) {
            System.err.println("Error escribiendo el fichero " + rutaFichero);
        } finally {
            try {
                if (buffWriter != null) {
                    buffWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Error cerrando el fichero.");
            }
        }
    }

    private static void recuperarUltimoIdentificador() {
        if (!trabajos.isEmpty()) {
            String ultimoIdentificador = trabajos.get(trabajos.size() - 1).getIdentidicadorTrabajo();
            String parteNumericaString = ultimoIdentificador.replace("T", "0");
            int parteNumerica = Integer.valueOf(parteNumericaString);
            Trabajo.setContadorIdentificador(parteNumerica);
        }

    }
}
