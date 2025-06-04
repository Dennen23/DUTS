/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Movements {
    private static final String ARCHIVO = "movimientos.txt";
    
    public static void guardarMovimientos(deposito Deposito){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))){
            bw.write(Deposito.toCSV());
            bw.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public static List<deposito> obtenerMovimientos(String usuario){
        List<deposito> Deposito = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                if(datos[2].equals(usuario)){
                    deposito dep = new deposito(
                    datos[0], datos[1], datos[3], Double.parseDouble(datos[4]));
                    Deposito.add(dep);
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        return Deposito;
    }
}
