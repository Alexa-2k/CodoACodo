/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Libro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Caro
 */
public class Conexion {
      Connection conexion; 

    
    //constructor que crea la bbdd en caso de no estar creada y genera la conexion
    public Conexion() {
        try {
            Statement s; 
            Class.forName("com.mysql.cj.jdbc.Driver"); //carga el controlador de la bbdd
            
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
            s = conexion.createStatement();
            //si no esta creada, crea la base de datos:
            s.executeUpdate("CREATE DATABASE IF NOT EXISTS CAC_Libros"); 
            //creo la tabla libros en caso de que no exista:
            s.executeUpdate("CREATE TABLE IF NOT EXISTS Libro (id_libro INT AUTO_INCREMENT, PRIMARY KEY(id_libro), nombreLibro VARCHAR(150), autor VARCHAR(50), nroEjemplares INT, ejemplaresPrestados INT)");
            s.close();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/CAC_Libros", "root", ""); //conecta con la bbdd 
        } catch (SQLException ex) { //en caso de haber algun error con la conexion pasa por aca y muestra un error por consola con los codigos de error (estos son los errores que aparecen en rojo cuando se compila)
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException ex) { //otro mensaje de error que dice que no se pudo establecer la conexion
            System.out.println("No se pudo establecer la conexión con la base de datos");
        }
    }
    
    
     
    public void guardarLibro(Libro libro){
        Statement stmt;
        String agregarLibro; //variable que vamos a usar para realizar el insert en la base de datos (para guardarlos)
        Boolean estaRegistrado = buscarLibro(libro); // llama al metodo buscarAlumno que esta mas abajo, para ver si el libro ya esta en la bbdd, devuelve un valor booleano (true si esta o false si no)
        
        
        if(!estaRegistrado){ 
            agregarLibro = "INSERT INTO alumnos (nombre, apellido, dni) VALUES('" + libro.getNombreLibro() +"', '" + libro.getAutor() + "', " + libro.getNroEjemplares() + ", " + libro.getEjemplaresPrestados() + ")";
            //se agregan los registros dentro de un try para poder capturar las excepciones en caso de haber error:
            try {
                stmt = conexion.createStatement();
                String st_inserta = agregarLibro;
                stmt.executeUpdate(st_inserta); //guarda los datos en la base de datos
                System.out.println("El libro " + libro.getNombreLibro() + "de " +  libro.getAutor() + " se cargo correctamente"); //muestra mensaje de que se guardó el libro
            } catch (SQLException ex) { //si pasa por aca, por el catch quiere decir que hubo algun error, mostramos aviso de que no se pudo guardar:
                System.out.println("Los datos del libro " + libro.getNombreLibro() + " de " +  libro.getAutor() + " no han podido ser guardados");
            }
        }else{//si pasa por el else quiere decir que el alumno ya estaba registrado, entonces no lo volvemos a guardar
            System.out.println("El libro ya se encontraba registrado en la base de datos");
        }
    }
    
    public boolean buscarLibro(Libro libro){
    return true;
    }
}
